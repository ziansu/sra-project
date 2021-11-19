public void pressKeyLoco(int i) {
    Traincraft.modChannel.sendToServer(new train.common.core.network.PacketKeyPress(i));
}