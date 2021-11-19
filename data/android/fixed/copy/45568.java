private java.lang.String getValue(java.util.Collection<java.lang.String> values) {
    if ((values == null) || (values.isEmpty())) {
        return "0";
    }else {
        return values.iterator().next();
    }
}