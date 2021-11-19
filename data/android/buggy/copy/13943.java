@java.lang.Override
public boolean isRunning() {
    return (com.github.ybq.android.spinkit.animation.AnimationUtils.isRunning(sprites)) || (com.github.ybq.android.spinkit.animation.AnimationUtils.isRunning(getAnimation()));
}