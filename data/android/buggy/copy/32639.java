public void hideIndex(java.lang.String dataElement) {
    if ((hiddenDataElementRows) == null) {
        hiddenDataElementRows = new java.util.HashMap<>();
    }
    hiddenDataElementRows.put(dataElement, true);
}