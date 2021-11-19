public void asyncSend(byte[] data) {
    while ((sendFlag) == false) {
        sendData = data;
        sendFlag = true;
    } 
}