public void asyncSend(byte[] data) {
    while ((sendFlag) == true) {
    } 
    while ((sendFlag) == false) {
        sendData = data;
        sendFlag = true;
    } 
}