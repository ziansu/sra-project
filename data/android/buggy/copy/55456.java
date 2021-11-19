public static void synchronizeSchema() {
    com.orientechnologies.orient.object.enhancement.OObjectEntitySerializer.OObjectEntitySerializedSchema serializedSchema = com.orientechnologies.orient.object.enhancement.OObjectEntitySerializer.getCurrentSerializedSchema();
    for (java.lang.Class<?> clazz : serializedSchema.classes) {
        com.orientechnologies.orient.object.enhancement.OObjectEntitySerializer.registerClass(clazz);
    }
}