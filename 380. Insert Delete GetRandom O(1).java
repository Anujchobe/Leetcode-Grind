class RandomizedSet {
    private Map<Integer, Integer> valToIndex; // Maps values to their indices in the list
    private List<Integer> values; // List of values for O(1) random access
    private Random random; // Random object to generate random indices

    public RandomizedSet() {
        valToIndex = new HashMap<>();
        values = new ArrayList<>();
        random = new Random();
    }
    
    public boolean insert(int val) {
        if (valToIndex.containsKey(val)) {
            return false; // Value already exists
        }
        values.add(val); // Add to the list
        valToIndex.put(val, values.size() - 1); // Map the value to its index
        return true;
    }
    
    public boolean remove(int val) {
        if (!valToIndex.containsKey(val)) {
            return false; // Value does not exist
        }
        int index = valToIndex.get(val); // Get the index of the value to remove
        int lastVal = values.get(values.size() - 1); // Get the last value in the list

        // Swap the value to remove with the last value in the list
        values.set(index, lastVal);
        valToIndex.put(lastVal, index);

        // Remove the last element
        values.remove(values.size() - 1);
        valToIndex.remove(val);
        return true;
    }
    
    public int getRandom() {
        int randomIndex = random.nextInt(values.size());
        return values.get(randomIndex);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
