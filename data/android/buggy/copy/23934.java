@java.lang.Override
public com.tixon.daggeractivitytests.dagger.components.IScreensComponent plusScreensComponent(com.tixon.daggeractivitytests.screens.main_activity.IMainView view) {
    if ((screensComponent) == null) {
        ((com.tixon.daggeractivitytests.dagger.components.AppComponent) (appComponent)).plus(new com.tixon.daggeractivitytests.dagger.modules.ScreensModule(view));
    }
    return screensComponent;
}