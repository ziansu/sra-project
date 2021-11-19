public static void newTextWindow() {
    TextEditorPanel temp = new TextEditorPanel(IDEWindow.textWidth, IDEWindow.textHeight, IDEWindow.numberOfTextWindows);
    IDEWindow.textEditor.addTab(("New File " + (IDEWindow.numberOfTextWindows)), temp);
}