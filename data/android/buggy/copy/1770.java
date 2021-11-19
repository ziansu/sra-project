@java.lang.Override
public void simpleInitApp() {
    appManager = new cinema.AppManager();
    stateManager.attach(appManager);
    appManager.setScenePath(scenePath);
    getFlyByCamera().setMoveSpeed(5);
}