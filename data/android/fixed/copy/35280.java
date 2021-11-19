private int getUnsignedShort(org.neo4j.kernel.impl.transaction.log.ReadableLogChannel channel) throws java.io.IOException {
    int result = (channel.getShort()) & 65535;
    return result == 65535 ? -1 : result;
}