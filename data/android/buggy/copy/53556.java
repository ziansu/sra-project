private static java.lang.Class[] getCompositeFieldTypes(java.lang.reflect.Field field) {
    org.scale7.cassandra.pelops.types.com.impetus.client.cassandra.pelops.composite.CompositeType ct = field.getAnnotation(org.scale7.cassandra.pelops.types.CompositeType.class);
    return ct.parts();
}