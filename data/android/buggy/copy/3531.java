public boolean containsKey(java.lang.String key) {
    return (properties.containsKey(key)) || ((parent) != null) ? parent.containsKey(key) : false;
}