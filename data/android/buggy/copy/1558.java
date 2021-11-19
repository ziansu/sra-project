private void startNewGame() {
    byui.cit260.buildYourDreamAbode.control.GameControl.createNewGame(buildyourdreamabode.BuildYourDreamAbode.getDesigner());
    byui.cit260.buildYourDreamAbode.view.GameMenuView gameMenu = new byui.cit260.buildYourDreamAbode.view.GameMenuView();
    gameMenu.display();
}