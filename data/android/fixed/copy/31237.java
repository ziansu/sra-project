@java.lang.Override
public com.cinnober.msgcodec.io.ByteArrayBuf clear() {
    pos = 0;
    limit = data.length;
    return this;
}