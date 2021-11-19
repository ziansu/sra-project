public void addDeleteItem(java.lang.String show) {
    if (!(deleteShows.contains(show))) {
        proposedUpdatesContainer.getChildren().add(new com.camelcasing.video.AddRemoveDialog.AddRemoveMenuItem(show, false));
    }
}