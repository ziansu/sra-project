private void keyRestart(java.util.Set<java.lang.Integer> pressedKeys) {
    if ((pressedKeys.contains(java.awt.event.KeyEvent.VK_SPACE)) && (!(active))) {
        activate();
    }
}