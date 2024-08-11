WITH 
-- 2021년에 가입한 회원 수 계산
members_2021 AS (
    SELECT COUNT(*) AS total_members
    FROM USER_INFO
    WHERE YEAR(JOINED) = 2021
),
-- 2021년 가입 회원의 구매 데이터
purchases AS (
    SELECT 
        YEAR(o.SALES_DATE) AS YEAR,
        MONTH(o.SALES_DATE) AS MONTH,
        COUNT(DISTINCT o.USER_ID) AS PURCHASED_USERS
    FROM ONLINE_SALE o
    JOIN USER_INFO u ON o.USER_ID = u.USER_ID
    WHERE YEAR(u.JOINED) = 2021
    GROUP BY YEAR(o.SALES_DATE), MONTH(o.SALES_DATE)
)

SELECT 
    p.YEAR,
    p.MONTH,
    p.PURCHASED_USERS,
    ROUND(p.PURCHASED_USERS / m.total_members, 1) AS PURCHASED_RATIO
FROM purchases p
CROSS JOIN members_2021 m
ORDER BY p.YEAR, p.MONTH;