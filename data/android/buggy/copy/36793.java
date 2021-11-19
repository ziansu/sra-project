private javax.persistence.criteria.Expression parse(final javax.persistence.criteria.Expression property, final java.lang.String value) {
    final java.lang.Class clazz = property.getJavaType();
    return criteriaBuilder.literal(com.peterphi.std.guice.hibernate.webquery.impl.WQTypeHelper.parse(clazz, value));
}