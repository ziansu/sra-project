public void checkSystemInput() {
    super.CheckSystemInput();
    if (configAction.isPressed()) {
        boolean show = !(dialog.isVisible());
        dialog.setVisible(show);
        setPaused(show);
    }
}