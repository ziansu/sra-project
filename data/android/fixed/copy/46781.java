public void processTextField() throws java.io.IOException, java.lang.NullPointerException {
    java.lang.System.out.println("Enter pressed");
    java.lang.String input = ui.list.swing.UserInterface.textField.getText();
    ui.list.swing.UserInterface.textField.setText(null);
    ui.list.swing.UserInterface.BTL.executeCommand(input);
    display();
}