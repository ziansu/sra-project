@java.lang.Override
public void startAnimation(java.lang.String id, com.bladecoder.engine.anim.Tween.Type repeatType, int count, com.bladecoder.engine.actions.ActionCallback cb, java.lang.String direction) {
    lookat(direction);
    startAnimation(id, repeatType, count, null);
}