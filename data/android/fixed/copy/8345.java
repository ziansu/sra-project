public java.lang.String getString(java.lang.String key) {
    tempObject = get(key);
    if ((tempObject) instanceof java.lang.String)
        return ((java.lang.String) (tempObject));
    
    return null;
}