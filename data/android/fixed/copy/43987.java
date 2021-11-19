public void minusButtonClicked(javafx.event.ActionEvent actionEvent) {
    com.dubyniak.bohdan.mycutevocabulary.controllers.DirectoriesController.storage.deleteVocabulary(lvAllDirectories.getSelectionModel().getSelectedItem());
    refreshList();
}