@javafx.fxml.FXML
private void initialize() {
    if (loaded)
        return ;
    
    loaded = false;
    statsOutputListView.setCellFactory(krow.guis.math_module.controllers.Statistic.getStatisticListCellFactory());
}