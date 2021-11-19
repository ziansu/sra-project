public java.lang.Integer increment(T key) {
    return histogram.put(key, (histogram.containsKey(key) ? (histogram.get(key)) + 1 : 1));
}