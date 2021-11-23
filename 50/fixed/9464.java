private void man() {
    java.io.File helpFile = new java.io.File("HelpCommands.html");
    try {
        java.awt.Desktop.getDesktop().browse(helpFile.toURI());
    } catch (java.io.IOException e) {
        logic.Output.showToUser(logic.Logic.MSG_WRONG_FILE);
    }
}