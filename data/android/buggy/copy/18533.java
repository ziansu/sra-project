@org.junit.Test
public void loadNonExistingFile() {
    java.lang.String filename = "nonexisting.xml";
    commandBox.runCommand(("load " + filename));
    assertResultMessage(java.lang.String.format(LoadCommand.MESSAGE_FILE_NONEXISTENT, filename));
}