@java.lang.Override
public void onMessage(final byte[] buffer, final int offset, final int length) {
    java.lang.System.arraycopy(buffer, offset, result, 0, length);
}