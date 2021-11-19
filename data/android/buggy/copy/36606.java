@javafx.fxml.FXML
public void saveExercise() {
    updateMapFromTabs();
    currentExercise.setMaps(classMap, testMap);
    FileHandler.saveFile(currentExercise);
}