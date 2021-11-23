@java.lang.Override
public java.util.Collection<V> values() {
    if ((valuesSubMapView) == null) {
        valuesSubMapView = new DescendingTrieSubMapValues();
    }
    return valuesSubMapView;
}