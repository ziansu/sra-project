void onInputSizeChanged(int width, int height) {
    this.mInputWidth = width;
    this.mInputHeight = height;
    initFboTexture(mInputWidth, mInputHeight);
}