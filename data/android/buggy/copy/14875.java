public void delDirection(javafx.event.ActionEvent actionEvent) {
    entity.DirectionEntity direction = directions.getSelectionModel().getSelectedItem();
    directions.getSelectionModel().selectFirst();
    controllers.GroupsPanelViewController.db.removeDirection(direction);
}