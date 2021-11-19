public byte[] convertToSendingPaket(int deviceID) {
    return convertToCMotionHeader(deviceID, floatArray2ByteArray(this.lastReceiveData));
}