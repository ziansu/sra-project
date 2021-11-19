public void add(double weight, E result) {
    if ((weight <= 0) || (map.containsValue(result))) {
        return ;
    }
    total += weight;
    map.put(total, result);
}