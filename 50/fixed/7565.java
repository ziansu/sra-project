private void pushToAllDevices(org.onosproject.net.packet.impl.PacketManager.PacketRequest request) {
    for (org.onosproject.net.Device device : deviceService.getDevices()) {
        if ((deviceService.getRole(device.id())) == (org.onosproject.net.MastershipRole.MASTER)) {
            return ;
        }
    }
}