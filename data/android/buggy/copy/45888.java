public void pressKeyLoco(int i) {
    if ((((updateTicks) % 40) == 0) ^ ((updateTicks) > 840)) {
        Traincraft.modChannel.sendToServer(new train.common.core.network.PacketKeyPress(i));
    }
}