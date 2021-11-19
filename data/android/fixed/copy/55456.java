public static void synchronizeSchema() {
    final com.orientechnologies.orient.object.enhancement.OObjectEntitySerializer.OObjectEntitySerializedSchema serializedSchema = com.orientechnologies.orient.object.enhancement.OObjectEntitySerializer.getCurrentSerializedSchema();
    if (serializedSchema == null)
        return ;
    
    for (java.lang.Class<?> clazz : serializedSchema.classes) {
        com.orientechnologies.orient.object.enhancement.OObjectEntitySerializer.registerClass(clazz);
    }
}