private void focusIndex(int index) {
    contentListView.getSelectionModel().select(index);
    contentListView.scrollTo(index);
    javafx.application.Platform.runLater(numberListView::requestLayout);
}