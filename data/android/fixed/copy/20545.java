public void add(double weight, E result) {
    if (map.containsValue(result)) {
        return ;
    }
    total += weight;
    map.put(total, result);
}