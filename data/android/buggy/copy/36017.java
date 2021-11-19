private void notifyVisibleAppLaunchListeners() {
    for (com.mapswithme.maps.background.AppBackgroundTracker.OnVisibleAppLaunchListener listener : mVisibleAppLaunchListeners)
        listener.onVisibleAppLaunch();
    
    mTransitionListeners.finishIterate();
}