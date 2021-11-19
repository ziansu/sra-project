public void actionPerformed(final java.awt.event.ActionEvent event) {
    MODEL.setUseFieldReadback(true);
    CONFIG_PVLOGGER_DATA.actionPerformed(null);
    MODEL.modelScenarioChanged();
    setHasChanges(true);
}