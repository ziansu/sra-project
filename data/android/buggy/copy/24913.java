@java.lang.Override
public void initialize(java.net.URL location, java.util.ResourceBundle resources) {
    vault.VaultMainControl.vaultMainControl = this;
    speculator.SpecConfig.ConfigSetUp();
    configControl = new speculator.SpecConfigControl();
    setInitialTableView();
    setRandomStatus();
}