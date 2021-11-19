@java.lang.Override
public boolean putDoubleList(java.lang.String key, java.util.List<java.lang.Double> value) {
    return putString(key, com.tramsun.libs.prefcompat.Serialize.toString(value.toArray()));
}