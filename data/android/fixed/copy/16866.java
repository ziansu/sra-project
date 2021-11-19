private void configureFileChooser(javafx.stage.FileChooser fileChooser) {
    fileChooser.setTitle("Select Picture");
    fileChooser.getExtensionFilters().addAll(new javafx.stage.FileChooser.ExtensionFilter("JPG", "*.jpg"));
}