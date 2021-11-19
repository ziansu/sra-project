private java.lang.Object parse(final javax.persistence.criteria.Expression property, final java.lang.String value) {
    final java.lang.Class clazz = property.getJavaType();
    return com.peterphi.std.guice.hibernate.webquery.impl.WQTypeHelper.parse(clazz, value);
}