public void executeCallNear() {
    int width = getOpWidth();
    long offset = com.zms.zpc.execute.NumberUtils.asSigned(readOp(width), width);
    callNear_(offset);
}