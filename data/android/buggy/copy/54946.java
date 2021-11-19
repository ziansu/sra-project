@java.lang.Override
public void handlePubsubItemReceived(com.magnet.mmx.client.MMXClient mmxClient, com.magnet.mmx.protocol.MMXTopic mmxTopic, com.magnet.mmx.client.api.MMXMessage mmxMessage) {
    com.magnet.mmx.client.api.MMXMessage message = com.magnet.mmx.client.api.MMXMessage.fromMMXMessage(mmxTopic, mmxMessage);
    if (message != null) {
        com.magnet.mmx.client.api.MMX.notifyMessageReceived(com.magnet.mmx.client.api.MMXMessage.fromMMXMessage(mmxTopic, mmxMessage));
    }
}