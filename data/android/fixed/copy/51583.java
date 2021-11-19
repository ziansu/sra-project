public boolean setValue(int index, K key, V oldValue, V newValue) {
    return this.subMap.setValue(index, key, oldValue, newValue);
}