@java.lang.Override
public int compare(java.util.Map.Entry<K, V> o1, java.util.Map.Entry<K, V> o2) {
    return o2.getValue().compareTo(o1.getValue());
}