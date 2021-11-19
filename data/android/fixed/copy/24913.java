@java.lang.Override
public void initialize(java.net.URL location, java.util.ResourceBundle resources) {
    vault.VaultMainControl.vaultMainControl = this;
    configControl = new speculator.SpecConfigControl();
    setInitialTableView();
    setRandomStatus();
}