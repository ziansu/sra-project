private boolean needRC() {
    if ((this.currentTimeRC) >= (this.maxTimeRC)) {
        this.currentTimeRC = 0;
        return true;
    }
    return false;
}