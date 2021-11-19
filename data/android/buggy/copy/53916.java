public void togglePauseMenu() {
    if (screenCanFocus(_pauseMenu)) {
        _pauseMenu.setVisible((!(_pauseMenu.isVisible())));
        _hud.setVisible((!(_pauseMenu.isVisible())));
    }
}