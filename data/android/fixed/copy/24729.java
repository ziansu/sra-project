@javafx.fxml.FXML
private void initialize() {
    if (loaded)
        return ;
    
    loaded = true;
    if ((statsOutputListView) != null)
        statsOutputListView.setCellFactory(krow.guis.math_module.controllers.Statistic.getStatisticListCellFactory());
    
}