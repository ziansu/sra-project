@java.lang.Override
public void initialize(java.net.URL location, java.util.ResourceBundle resources) {
    if ((TerminalPanelController.flag) == 1) {
        disableFields(true);
    }
    if ((TerminalPanelController.flag) == 2) {
        btnEdit.setVisible(false);
    }
}