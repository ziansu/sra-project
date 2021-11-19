private java.lang.Integer getInteger(com.mongodb.DBObject dbo, java.lang.String key) {
    return java.lang.Integer.parseInt(((java.lang.String) (dbo.get(key))));
}