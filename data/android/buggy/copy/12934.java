@java.lang.Override
public boolean putLongList(java.lang.String key, java.util.List<java.lang.Long> value) {
    return putString(key, com.tramsun.libs.prefcompat.Serialize.toString(value.toArray()));
}