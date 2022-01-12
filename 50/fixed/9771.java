public java.lang.String promptControl() {
    java.lang.String ctrl = "";
    java.lang.System.out.print("Enter a control: ");
    ctrl = Keyboard.readString();
    ctrl = ctrl.toLowerCase();
    return ctrl;
}