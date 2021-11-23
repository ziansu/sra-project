@java.lang.Override
public void handle(javafx.scene.input.KeyEvent key) {
    if ((mainStage.getScene()) == (gameScene)) {
        gameScreen.gameLogic.pressKey(key.getCode());
    }
}