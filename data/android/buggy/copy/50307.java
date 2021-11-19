public void showGameChooser() {
    gui.GameChooserPanel gcp = new gui.GameChooserPanel(pnGame, gClient);
    aktPanel = gcp;
    pnGame.removeAll();
    pnGame.add(gcp);
    pnGame.updateUI();
}