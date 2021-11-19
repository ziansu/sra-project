private int findUriID(java.lang.String uri) {
    java.lang.Integer id = uriRefIds.getId(uri);
    if (id != null)
        return id;
    
    return -2;
}