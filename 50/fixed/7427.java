public static int calculateDataSize(com.hazelcast.cluster.client.MemberAttributeChange memberAttributeChange) {
    return (com.hazelcast.client.impl.protocol.ClientMessage.HEADER_SIZE) + (com.hazelcast.client.impl.protocol.parameters.MemberAttributeChangeCodec.calculateDataSize(memberAttributeChange));
}