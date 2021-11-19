public void show() {
    java.lang.System.out.println("show");
    float y = getY();
    setY(Gdx.graphics.getHeight());
    clearActions();
    addAction(com.badlogic.gdx.scenes.scene2d.actions.Actions.moveTo(0, y, 0.33F, Interpolation.exp5Out));
}