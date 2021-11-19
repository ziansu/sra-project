public boolean handleBackButton() {
    boolean exit = parentNode.isEmpty();
    if (!exit) {
        depthChangeListener.handleDepthChange(false);
    }
    return exit;
}