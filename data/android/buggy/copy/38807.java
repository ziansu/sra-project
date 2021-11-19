@java.lang.Override
public void merge(byte[] key, byte[] value) {
    assert isOwningHandle();
    merge(nativeHandle_, key, key.length, value, value.length);
}