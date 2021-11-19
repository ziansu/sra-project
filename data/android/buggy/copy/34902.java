@java.lang.Override
public void onRecv(byte[] b, int off, int len) {
    super.onRecv(b, off, len);
    dump(b, off, len, (!(useClientMode)));
}