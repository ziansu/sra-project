private java.util.Map<K, V> getView() {
    if ((view) == null) {
        view = java.util.Collections.unmodifiableMap(core);
    }
    return view;
}