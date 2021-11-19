private static void sendByte(boolean rs, int data) {
    Emitter.send(true, (rs ? (data << 1) | 1 : (data << 1) & 254), 9);
}