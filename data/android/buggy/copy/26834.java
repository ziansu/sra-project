private void processArrayList() {
    ui.controller.UIController uiController = ui.controller.UIController.getInstance(null);
    java.lang.String[] output = uiController.formatOutput(taskList);
    appendTexts(textArea, output);
}