protected void resetController() {
    player = new sem.group15.bubblebobble.core.objects.Player(sem.group15.bubblebobble.core.GameController.PLAYER_XY_SPAWN, sem.group15.bubblebobble.core.GameController.PLAYER_XY_SPAWN);
    state = sem.group15.bubblebobble.core.GameController.GameState.PLAY;
    currentLevelNumber = 1;
}