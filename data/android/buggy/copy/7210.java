public boolean contains(T obj) {
    if (!(map.contains(obj)))
        return false;
    
    return bits.get(map.getInt(obj));
}