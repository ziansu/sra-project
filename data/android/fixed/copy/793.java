public java.lang.String getString(java.lang.String key) {
    if ((map.get(key)) != null) {
        return map.get(key).toString();
    }
    return null;
}