public java.util.Collection<java.lang.String> properties(unknow.orm.criteria.Entity<?> entity) {
    java.util.List<java.lang.String> properties = new java.util.ArrayList<java.lang.String>();
    for (unknow.orm.criteria.Entity.Entry e : entity.entries) {
        properties.add(e.javaName);
    }
    return properties;
}