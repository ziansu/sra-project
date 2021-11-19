private void checkError() {
    if (((receivePacket.getData()[0]) == 0) && ((receivePacket.getData()[1]) == 5))
        error = 1;
    
}