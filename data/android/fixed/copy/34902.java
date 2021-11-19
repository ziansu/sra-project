@java.lang.Override
public void onRecv(byte[] b, int off, int len) {
    dump(b, off, len, (!(useClientMode)));
    super.onRecv(b, off, len);
}