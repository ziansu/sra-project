private void doubleClick(com.badlogic.ashley.core.Entity entity, float x, float y) {
    if ((currentSelectedTool) != null) {
        com.uwsoft.editor.view.stage.Sandbox sandbox = com.uwsoft.editor.view.stage.Sandbox.getInstance();
        currentSelectedTool.stageMouseDoubleClick(x, y);
    }
}