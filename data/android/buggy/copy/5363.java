private void record(java.lang.String name, java.lang.Integer value) {
    if (value != null) {
        map.put(name, (value++));
    }else {
        map.put(name, 1);
    }
}