@java.lang.Override
public V get() {
    ensureInitialized();
    final V value = this.value.get().get();
    return value;
}