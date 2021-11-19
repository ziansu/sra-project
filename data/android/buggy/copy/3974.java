@java.lang.Override
public void init() throws java.lang.Exception {
    java.lang.System.out.println("Init");
    stage = launch(dpfmanager.MainApp.class);
    scene = stage.getScene();
}