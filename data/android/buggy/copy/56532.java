public synchronized void doAction() {
    if ((mExtensions.isEmpty()) || (isMenuEmpty())) {
        createMenu();
    }
    super.doAction();
}