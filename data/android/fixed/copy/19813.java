public boolean init() {
    if ((mBitmap) == null) {
        return false;
    }
    initVertexData();
    initShader();
    if (!(initTexture())) {
        return false;
    }
    isInited = true;
    return isInited;
}