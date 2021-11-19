@java.lang.Override
public boolean touchDown(com.badlogic.gdx.scenes.scene2d.InputEvent event, float x, float y, int pointer, int button) {
    positionManager.setBeforePositionType(positionManager.getCurrentPositionType());
    screenFactory.show(ScreenEnum.LOG);
    return true;
}