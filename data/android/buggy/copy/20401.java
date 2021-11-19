@java.lang.Override
public void onClicked() {
    com.TeamHEC.LocomotionCommotion.LocomotionCommotion.isReplay = true;
    com.TeamHEC.LocomotionCommotion.LocomotionCommotion.gameMode = com.TeamHEC.LocomotionCommotion.Scene.StartMenu.gameMode;
    com.TeamHEC.LocomotionCommotion.LocomotionCommotion.turnChoice = com.TeamHEC.LocomotionCommotion.Scene.StartMenu.turnChoice;
    getJSONData();
    resetNewGameScreen();
    java.lang.System.out.println("test");
    com.TeamHEC.LocomotionCommotion.LocomotionCommotion.getInstance().setGameScreen();
}