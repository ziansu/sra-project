@javafx.fxml.FXML
private void mosaicFilter() throws java.io.IOException {
    openDialog("/Views/MosaicDialog.fxml");
    filter_image.setImage(fullColorFiltered.getImage());
    updateHistogram(fullColorFiltered.getImage());
}