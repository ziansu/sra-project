private int getUnsignedShort(org.neo4j.kernel.impl.transaction.log.ReadableLogChannel channel) throws java.io.IOException {
    return (channel.getShort()) & 65535;
}