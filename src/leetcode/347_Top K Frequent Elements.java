public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
        if(nums == null || nums.length == 0 || k == 0) {
            return result;
        }
        //count the frequency
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                int count = map.get(nums[i]);
                map.put(nums[i], count + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(k, new Comparator<Map.Entry<Integer, Integer>>() {
                public int compare(Map.Entry<Integer, Integer> entry1, Map.Entry<Integer, Integer> entry2) {
                    return entry1.getValue() - entry2.getValue();
                }
            });
        //build the min heap
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if(pq.size() == k) {
                if(value > pq.peek().getValue()) {
                    pq.poll();
                    pq.offer(entry);
                }
            } else {
                pq.offer(entry);
            }
        }
        while(!pq.isEmpty()) {
            result.add(0, pq.poll().getKey());
        }
        return result;
    }
}