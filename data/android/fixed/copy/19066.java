protected boolean isValidOpCode(java.net.DatagramPacket packet) {
    if (((packet.getData()[0]) != 0) && ((packet.getData()[1]) > 5))
        return false;
    
    return true;
}