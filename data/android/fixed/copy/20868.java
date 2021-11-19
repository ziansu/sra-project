public java.lang.String fetchString(java.lang.String... keys) {
    java.lang.Object value = this.fetch(keys);
    if (value instanceof java.lang.String) {
        return ((java.lang.String) (value));
    }else {
        return null;
    }
}