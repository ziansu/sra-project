@java.lang.Override
public void setupComponent() {
    com.tixon.daggeractivitytests.app.IApp app = ((com.tixon.daggeractivitytests.app.IApp) (getApplication()));
    com.tixon.daggeractivitytests.dagger.components.ITestScreensComponent component = ((com.tixon.daggeractivitytests.dagger.components.ITestScreensComponent) (app.plusScreensComponent(this)));
    component.inject(this);
}