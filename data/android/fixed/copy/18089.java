private void play() {
    GUI.Pages.Window.getServerController().addTask(new Controllers.GUIData(Controllers.GUIData.GUI_COMMAND.RESUME));
}