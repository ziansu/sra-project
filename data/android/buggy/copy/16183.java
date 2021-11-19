public boolean isConnected() {
    if (this.isMounted()) {
        return (pool.getState()) == (Session.State.open);
    }
    return false;
}