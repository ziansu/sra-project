@java.lang.Override
public boolean contains(T obj) {
    return (map.contains(obj)) && (bits.get(map.getInt(obj)));
}