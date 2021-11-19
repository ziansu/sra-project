@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent actionEvent) {
    gui.gameManager.acceptChallenge(challengeNumber, game);
    closeWindow();
}