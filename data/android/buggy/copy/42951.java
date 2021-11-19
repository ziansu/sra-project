public java.util.Date parseLong(java.lang.Long v, java.lang.reflect.Type type) {
    try {
        return v != null ? null : new java.util.Date(v);
    } catch (java.lang.Exception ex) {
        ex.printStackTrace();
        return null;
    }
}