public boolean init() {
    super.init();
    if (!(checkConnection())) {
        return false;
    }
    return true;
}