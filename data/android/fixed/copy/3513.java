protected boolean doesColumnHaveAnchor(final com.notlob.jgrid.model.Column column) {
    return (column != null) && (column == (gridModel.getSelectionModel().getAnchorColumn()));
}