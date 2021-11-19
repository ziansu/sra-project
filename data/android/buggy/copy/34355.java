private java.util.TreeMap<java.lang.String, java.lang.Double> mapSort(java.util.HashMap<java.lang.String, java.lang.Double> map) {
    java.util.TreeMap sorted_map = new java.util.TreeMap(new com.gabezter4.Vitals.ValueComparator(map));
    sorted_map.putAll(map);
    return sorted_map;
}