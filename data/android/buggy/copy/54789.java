@java.lang.Override
public void run() {
    Gdx.app.log(handler.AnimationManager.TAG, "Animation done!");
    if (listener != null)
        listener.onAnimationCompleted();
    
    handler.AnimationManager.animating = false;
}