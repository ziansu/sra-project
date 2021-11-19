@java.lang.Override
public int compare(java.util.Map.Entry<K, V> e1, java.util.Map.Entry<K, V> e2) {
    return -(e2.getValue().compareTo(e1.getValue()));
}