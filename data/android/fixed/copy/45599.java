@java.lang.Override
public boolean putDoubleList(java.lang.String key, java.util.List<java.lang.Double> value) {
    java.lang.Double[] array = new java.lang.Double[value.size()];
    return putString(key, com.tramsun.libs.prefcompat.Serialize.toString(value.toArray(array)));
}