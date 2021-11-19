public static Road getRoad(int id) {
    for (java.util.Map.Entry<java.lang.Integer, Road> r : Application.roads.entrySet()) {
        if ((r.getKey()) == id)
            return r.getValue();
        
    }
    return null;
}