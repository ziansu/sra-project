@java.lang.Override
public void putAll(@android.support.annotation.NonNull
final java.util.Map<? extends java.lang.String, ? extends V> map) {
    for (java.lang.String key : map.keySet()) {
        put(key, map.get(key));
    }
}