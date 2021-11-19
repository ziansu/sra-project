@java.lang.Override
public boolean putFloatList(java.lang.String key, java.util.List<java.lang.Float> value) {
    return putString(key, com.tramsun.libs.prefcompat.Serialize.toString(value.toArray()));
}