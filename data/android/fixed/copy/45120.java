@java.lang.Override
public com.badlogic.gdx.scenes.scene2d.Action copy() {
    if ((action) != null) {
        return com.badlogic.gdx.scenes.scene2d.actions.Delay.$(action.copy(), duration);
    }else {
        return com.badlogic.gdx.scenes.scene2d.actions.Delay.$(duration);
    }
}