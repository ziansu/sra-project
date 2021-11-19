public org.mobicents.media.server.spi.memory.Frame getData() {
    if (!(this.shouldRead)) {
        if ((frame) != null) {
            frame.recycle();
        }
        return null;
    }
    return frame;
}