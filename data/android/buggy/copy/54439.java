public void keyPressed(java.awt.event.KeyEvent evt) {
    state.handleKeyInput(evt);
    java.lang.System.out.println((((leader.getX()) + " ") + (leader.getY())));
}