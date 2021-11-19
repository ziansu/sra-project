public void levelFinished() {
    saveProgress();
    dispose();
    game.setScreen(new com.retroMachines.ui.screens.menus.LevelMenuScreen(game));
}