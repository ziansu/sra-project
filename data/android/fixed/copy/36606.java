@javafx.fxml.FXML
public void saveExercise() {
    updateMapFromTabs();
    if ((currentExercise) != null) {
        currentExercise.setMaps(classMap, testMap);
        FileHandler.saveFile(currentExercise);
    }
}