public boolean insert(int val) {
    if (valueMap.containsKey(val)) {
        return true;
    }
    (count)++;
    valueMap.put(val, count);
    randomMap.put(count, val);
    return true;
}