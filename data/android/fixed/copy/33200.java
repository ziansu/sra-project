public void setSize(int width, int height, boolean setAsDefaultIfSuccess) {
    edit(() -> setSizeUnsafe(width, height, setAsDefaultIfSuccess));
}