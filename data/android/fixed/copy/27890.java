@java.lang.Override
public void handle(javafx.scene.input.KeyEvent event) {
    java.lang.System.out.println("Key pressed in Phone text field");
    tfPhone.setStyle((session.validatePhoneInput(tfPhone.getText()) ? "" : org.jabst.jabs.RegisterGUI.redBorder));
}