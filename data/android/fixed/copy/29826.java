private boolean needRC() {
    if ((this.currentTimeRC) >= (this.maxTimeRC)) {
        this.currentTimeRC -= maxTimeRC;
        return true;
    }
    return false;
}