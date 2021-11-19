private static void sendKeyControlsPacket(int key) {
    Traincraft.keyChannel.sendToServer(new train.common.core.network.PacketKeyPress(key));
}