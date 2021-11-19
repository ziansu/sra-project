@java.lang.Override
public void remove() {
    java.util.Map.Entry<K, V> entry = next();
    mObject.deleteProperty(entry.getKey().toString());
}