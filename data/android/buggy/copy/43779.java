@java.lang.Override
public void run() {
    isAnimationRunning = false;
    if ((onFinishShowingListener) != null)
        onFinishShowingListener.onFinishShowing(this);
    
}