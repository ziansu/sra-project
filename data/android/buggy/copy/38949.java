@java.lang.Override
public void onActivityStarted(android.app.Activity activity) {
    if (isFirstLaunch.compareAndSet(true, false)) {
        appState = com.jenzz.appstate.AppState.FOREGROUND;
    }
    if ((appState) == (com.jenzz.appstate.AppState.BACKGROUND)) {
        onAppDidEnterForeground();
    }
}