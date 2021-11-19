private void exitApplication() {
    if ((currentPlayer) != null) {
        currentPlayer.stop();
        currentPlayer.dispose();
    }
    getCurrentStage().close();
    javafx.application.Platform.runLater(new fun.personalUse.mainAlbumTunesApp.AlbumTunesController.ExitApplication());
}