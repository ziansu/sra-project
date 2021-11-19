@java.lang.Override
public void create() {
    Gdx.app.setLogLevel(Application.LOG_DEBUG);
    worldController = new edu.miamioh.worldEditor.WorldController();
    worldRenderer = new edu.miamioh.worldEditor.WorldRenderer(worldController);
    srTest = new edu.miamioh.verilogworld.SchematicRendererTest(worldController);
    paused = false;
}