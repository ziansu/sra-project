@java.lang.Override
protected java.nio.ByteBuffer enhanceMessage(java.nio.ByteBuffer typedMessageBuffer) {
    return de.tum.p2p.util.Paddings.randPad(typedMessageBuffer);
}