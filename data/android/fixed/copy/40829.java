public void init() {
    if (!(isDebug)) {
        frame.removeNotify();
        frame.setUndecorated(true);
        frame.addNotify();
    }
    super.init();
}