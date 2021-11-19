public void onMuxData(int channelId, byte[] data, int offset, int length) {
    _onBinaryMessage.onMessage(data, offset, length);
}