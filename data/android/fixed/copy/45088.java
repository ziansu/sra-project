@java.lang.Override
public void simpleInitApp() {
    stateManager.attachAll(new appstates.VisualAppState(), new appstates.GameplayAppState(), new appstates.EntityDataState());
}