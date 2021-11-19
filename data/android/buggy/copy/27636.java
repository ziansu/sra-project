public void playSelectedSong(javafx.scene.input.MouseEvent event) {
    if ((event.getClickCount()) == 2) {
        songsInAlbum = metaDataTable.getItems();
        startAlbum(metaDataTable.getSelectionModel().getSelectedIndex());
    }
}