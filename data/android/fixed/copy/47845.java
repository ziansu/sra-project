@java.lang.Override
public void putLogData(byte[] blob) {
    putLogData(nativeHandle_, blob, blob.length);
}