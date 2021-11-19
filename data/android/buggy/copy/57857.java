@java.lang.SuppressWarnings(value = "unchecked")
public <X extends com.kloudtek.ktserializer.Serializable> java.util.List<X> readObjectList(java.lang.Class<X> expectedClass, com.kloudtek.ktserializer.ClassMapper classMapper) throws com.kloudtek.ktserializer.InvalidSerializedDataException, java.io.IOException {
    return new java.util.ArrayList<X>(((com.kloudtek.ktserializer.SerializableList) (readObject(classMapper, com.kloudtek.ktserializer.SerializableList.class))));
}