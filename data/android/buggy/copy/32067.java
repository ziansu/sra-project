@java.lang.Override
public int doFinal(byte[] out, int outOff) {
    out[0] = 1;
    digest.doFinal(out, (outOff + 1));
    reset();
    return getDigestSize();
}