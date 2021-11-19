@javafx.fxml.FXML
private void runProgram() throws java.io.IOException, java.lang.InterruptedException {
    saveFile();
    java.lang.String args = exec(file.getAbsolutePath());
    java.lang.Process child = java.lang.Runtime.getRuntime().exec(args);
}