@java.lang.Override
public void handleReconnect(org.terracotta.entity.ClientDescriptor clientDescriptor, byte[] extendedReconnectData) {
    org.ehcache.clustered.common.internal.messages.ClusterTierManagerReconnectMessage reconnectMessage = reconnectMessageCodec.decodeReconnectMessage(extendedReconnectData);
    org.ehcache.clustered.server.ClusterTierManagerActiveEntity.LOGGER.info("Client '{}' successfully reconnected to newly promoted ACTIVE after failover.", clientDescriptor);
}