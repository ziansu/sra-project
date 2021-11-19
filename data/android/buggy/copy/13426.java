public void stop() {
    if (!(running)) {
        return ;
    }
    running = false;
    sm.getSelectedState().onExit();
    this.dispose();
}