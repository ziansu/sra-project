private void drawPage(net.raphaelmiller.GUIWindow guiOutput, net.raphaelmiller.TextArea results, java.lang.String textValues) {
    guiOutput.quitButton();
    guiOutput.horizontalPanel.addComponent(results);
    results.appendLine(textValues);
}