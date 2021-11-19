@java.lang.Override
public void onMessage(byte[] buffer, int offset, int length) {
    java.lang.System.arraycopy(buffer, offset, result, 0, length);
}