@java.lang.Override
public void onHomeButtonPressed() {
    homePressWatcher.stopWatch();
    if ((view) != null)
        manager.removeView(view);
    
}