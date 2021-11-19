@java.lang.Override
protected void result(java.lang.Object object) {
    this.hide();
    popupScreenIsShown = false;
    gameController.abortLevel();
    game.setScreen(new com.retroMachines.ui.screens.menus.LevelMenuScreen(game));
}