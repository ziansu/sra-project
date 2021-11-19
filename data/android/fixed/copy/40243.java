public boolean containsKey(java.lang.Object k) {
    if (!(k instanceof java.lang.Integer))
        return false;
    
    return containsKey(((java.lang.Integer) (k)).intValue());
}