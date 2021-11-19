@java.lang.Override
@java.lang.SuppressWarnings(value = "unchecked")
public V remove(java.lang.Object key) {
    V value = super.remove(key);
    this.evictionListener.onEviction(((K) (key)), value);
    return value;
}