public static void processUserTextField(javafx.scene.control.TextField userTextField, int height) {
    gui.GUI.executeCommand(userTextField.getText(), height);
    userTextField.clear();
}