@java.lang.Override
public void encode(java.lang.Object group, com.cinnober.msgcodec.io.ByteSink out) throws java.io.IOException {
    generatedCodec.writeDynamicGroup(((com.cinnober.msgcodec.io.ByteBuf) (out)), group);
}