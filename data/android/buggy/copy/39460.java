public static java.util.List<java.lang.String> getClassFields(final java.lang.Class<?> iClass) {
    com.orientechnologies.orient.object.enhancement.OObjectEntitySerializer.OObjectEntitySerializedSchema serializedSchema = com.orientechnologies.orient.object.enhancement.OObjectEntitySerializer.getCurrentSerializedSchema();
    return serializedSchema.allFields.get(iClass);
}