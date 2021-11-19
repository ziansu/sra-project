@java.lang.Override
public void start(javafx.stage.Stage mainStage) throws java.lang.Exception {
    edu.cis232.gwasos.resources.Map map = new edu.cis232.gwasos.resources.Map();
    edu.cis232.gwasos.resources.StartScreen sScreen = new edu.cis232.gwasos.resources.StartScreen();
    edu.cis232.gwasos.resources.GUIHandler guiHandler = new edu.cis232.gwasos.resources.GUIHandler(mainStage, sScreen, map);
}