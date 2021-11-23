public double getTrafficLevel(java.lang.String id) {
    return (map.get(id)) != null ? map.get(id) : 1.0;
}