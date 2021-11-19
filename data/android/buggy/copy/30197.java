@java.lang.Override
public void write(java.io.DataOutputStream stream) throws java.io.IOException {
    stream.writeByte(liquid.ordinal());
    stream.writeByte(((byte) (liquidAmount)));
}