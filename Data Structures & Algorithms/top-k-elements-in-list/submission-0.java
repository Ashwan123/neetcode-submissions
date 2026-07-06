class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Step 1: Count frequencies
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num : nums) {
            // TODO: Update the frequency
            if(freqMap.containsKey(num))
            {
freqMap.put(num,freqMap.get(num)+1);
            }
            else
            {
freqMap.put(num,1);
            }
            
        }

        // Step 2: Create a min heap based on frequency
        PriorityQueue<Map.Entry<Integer, Integer>> pq =
                new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());

        // Step 3: Add entries to the heap
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {

            pq.add(entry);

            // TODO: Keep heap size equal to k
            if (pq.size()>k) {
                pq.remove();
            }
        }

        // Step 4: Build answer
        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = pq.remove().getKey();
        }

        return ans;
    }
}