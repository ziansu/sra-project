@java.lang.Override
public void putAll(@android.support.annotation.NonNull
final java.util.Map<? extends K, ? extends V> map) {
    for (K key : map.keySet()) {
        put(key, map.get(key));
    }
}