private void enableDDGCommands() {
    laser.ddg.gui.DDGExplorer.saveDB.setEnabled((!(laser.ddg.gui.DDGExplorer.getCurrentDDGPanel().alreadyInDB())));
    attributesItem.setEnabled(true);
    showScriptItem.setEnabled(true);
}