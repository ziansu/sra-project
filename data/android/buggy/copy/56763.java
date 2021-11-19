private synchronized void setSpeed(byte s) {
    if (s < 0) {
        s = ((byte) (-s));
        s |= 1 << 7;
    }
    speed = s;
}