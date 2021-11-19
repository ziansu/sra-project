@java.lang.Override
public void readFrom(org.jboss.netty.buffer.ChannelBuffer data) {
    super.readFrom(data);
    ofControllerRole = org.onosproject.floodlightpof.protocol.OFControllerRole.values()[data.readByte()];
    data.readBytes(3);
}