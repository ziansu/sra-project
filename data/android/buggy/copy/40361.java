@javafx.fxml.FXML
public void onSelectAll() throws java.sql.SQLException {
    for (java.lang.String selectedEpisode : selectedEpisodes) {
        java.lang.System.out.println(selectedEpisode);
    }
    updatePanes(true);
}