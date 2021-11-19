@java.lang.Override
public boolean putBooleanList(java.lang.String key, java.util.List<java.lang.Boolean> value) {
    return putString(key, com.tramsun.libs.prefcompat.Serialize.toString(value.toArray()));
}