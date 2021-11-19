public void setModel(model.data.DataModel model) {
    tableViewController.setDataModel(model);
    analysisController.setDataModel(model);
    visualizationController.setDataModel(model);
    visualizationController.initializeVisualisation();
}