@java.lang.Override
public com.badlogic.gdx.scenes.scene2d.Action copy() {
    return com.badlogic.gdx.scenes.scene2d.actions.Delay.$(action.copy(), duration);
}