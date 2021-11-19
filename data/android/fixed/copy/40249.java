public net.ballmerlabs.scatterbrain.network.BLE.BLEPacket dequeuePacket() {
    if ((packetqueue.size()) > 0) {
        net.ballmerlabs.scatterbrain.network.BLE.BLEPacket result = packetqueue.get(0);
        packetqueue.remove(0);
        return result;
    }else
        return null;
    
}