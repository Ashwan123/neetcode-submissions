class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            
            // Convert string to char array
            char[] chars = str.toCharArray();

            // Sort the characters
            Arrays.sort(chars);

            // Convert back to String (this is the key)
            String key = new String(chars);

            // If key doesn't exist, create a new list
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            // Add the original string to the list
            map.get(key).add(str);
        }

        // Return all the grouped anagrams
        return new ArrayList<>(map.values());
    }
}