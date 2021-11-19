public void displayWelcomeView() {
    displayBanner();
    displayGamePlotSummary();
    byui.cit260.fireSwamp.model.Player player = getPlayerInfo();
    greetPlayer(player);
}