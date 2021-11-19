public int findKey(java.lang.String key) {
    int value;
    if (map.containsKey(key)) {
        value = map.get(key);
    }else {
        value = -1;
    }
    return value;
}