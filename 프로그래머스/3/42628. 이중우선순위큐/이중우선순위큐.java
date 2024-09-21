import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        HashMap<Integer, Integer> countMap = new HashMap<>();
        
        for (String operation : operations) {
            String[] parts = operation.split(" ");
            String cmd = parts[0];
            int num = Integer.parseInt(parts[1]);

            if (cmd.equals("I")) {
                minHeap.offer(num);
                maxHeap.offer(num);
                countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            } else if (cmd.equals("D")) {
                if (num == 1) {
                    removeTop(maxHeap, minHeap, countMap);
                } else {
                    removeTop(minHeap, maxHeap, countMap);
                }
            }
        }

        // 큐가 비어있는지 확인하고 동기화
        removeInvalidEntries(minHeap, countMap);
        removeInvalidEntries(maxHeap, countMap);

        if (minHeap.isEmpty()) {
            return new int[]{0, 0};
        } else {
            return new int[]{maxHeap.peek(), minHeap.peek()};
        }
    }
    
    private void removeTop(PriorityQueue<Integer> fromHeap, PriorityQueue<Integer> otherHeap, HashMap<Integer, Integer> countMap) {
        removeInvalidEntries(fromHeap, countMap);
        if (!fromHeap.isEmpty()) {
            int top = fromHeap.poll();
            countMap.put(top, countMap.get(top) - 1);
        }
    }

    private void removeInvalidEntries(PriorityQueue<Integer> heap, HashMap<Integer, Integer> countMap) {
        while (!heap.isEmpty() && countMap.get(heap.peek()) == 0) {
            heap.poll();
        }
    }
}