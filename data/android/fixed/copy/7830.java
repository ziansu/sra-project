public java.lang.Integer getPermission(java.lang.Integer func) {
    java.lang.Integer n = this.permissions.get(new java.lang.Long(func));
    if (n == null)
        return iddb.core.model.Server.MAX_LEVEL;
    
    return n;
}