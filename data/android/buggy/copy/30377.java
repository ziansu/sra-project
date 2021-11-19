@java.lang.Override
public void put(byte[] key, byte[] value) {
    assert isOwningHandle();
    put(nativeHandle_, key, key.length, value, value.length);
}