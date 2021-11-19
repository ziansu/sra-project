@java.lang.Override
public int getWireLength(org.anarres.ipmi.protocol.client.session.IpmiPacketContext context) {
    return ((((0 + 4) + 1) + 1) + 1) + (getDataWireLength());
}