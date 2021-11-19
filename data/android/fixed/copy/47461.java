@java.lang.Override
public boolean putIntList(java.lang.String key, java.util.List<java.lang.Integer> value) {
    java.lang.Integer[] array = new java.lang.Integer[value.size()];
    return putString(key, com.tramsun.libs.prefcompat.Serialize.toString(value.toArray(array)));
}