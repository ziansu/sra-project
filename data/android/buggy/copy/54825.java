@java.lang.Override
public void initialize(java.net.URL location, java.util.ResourceBundle resources) {
    java.lang.System.out.println("initilize");
    if ((TerminalPanelController.flag) == 1) {
        disableFields(true);
    }
    if ((TerminalPanelController.flag) == 2) {
        btnEdit.setVisible(false);
    }
}