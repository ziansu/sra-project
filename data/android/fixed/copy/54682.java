public static void processUserTextField(javafx.scene.control.TextField userTextField, int height) {
    java.lang.String temp = userTextField.getText();
    userTextField.clear();
    gui.GUI.executeCommand(temp, height);
}