@java.lang.Override
public boolean putStringList(java.lang.String key, java.util.List<java.lang.String> value) {
    return putString(key, com.tramsun.libs.prefcompat.Serialize.toString(value.toArray()));
}