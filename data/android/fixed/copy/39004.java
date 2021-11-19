public org.sql2o.Query addParameter(java.lang.String name, java.util.Date value) {
    java.sql.Date sqlDate = (value == null) ? null : new java.sql.Date(value.getTime());
    return addParameter(name, sqlDate);
}