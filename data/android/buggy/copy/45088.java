@java.lang.Override
public void simpleInitApp() {
    stateManager.attachAll(new appstates.GameplayAppState(), new appstates.EntityDataState(), new appstates.VisualAppState());
}