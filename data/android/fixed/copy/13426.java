public void stop() {
    if (!(running)) {
        return ;
    }
    running = false;
    sm.getSelectedState().onExit();
    this.dispose();
    java.lang.System.exit(0);
}