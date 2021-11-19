public void handle(javafx.stage.WindowEvent we) {
    updateDatabaseWithUIModel(controller.getUictrlDatabaseEntryTable().getItems());
    saveAndClearLoadedDatabase();
}