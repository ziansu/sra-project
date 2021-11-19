public void setNewGame(com.ma.schiffeversenken.android.controller.Game game2) {
    try {
        com.ma.schiffeversenken.android.model.Player.game.sleep(500);
        com.ma.schiffeversenken.android.model.Player.game.interrupt();
    } catch (java.lang.InterruptedException e) {
        java.lang.System.out.println("Unterbrechung in sleep()");
        this.game = game2;
    }
}