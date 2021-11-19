public void showGameChooser() {
    gui.GameChooserPanel gcp = new gui.GameChooserPanel(pnGame, gClient, this);
    aktPanel = gcp;
    pnGame.removeAll();
    pnGame.add(gcp);
    pnGame.updateUI();
}