private static java.lang.Class<?> backParameterized() {
    com.arangodb.entity.EntityDeserializers.ClassHolder holder = com.arangodb.entity.EntityDeserializers.parameterizedBridger.get();
    if (holder == null) {
        return null;
    }
    return holder.back();
}