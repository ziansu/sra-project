public void removeResolvedStringID(java.lang.String term, java.lang.String id) {
    stringNetwork.removeResolvedStringID(term, id);
    if (!(stringNetwork.haveResolvedNames()));
    importButton.setEnabled(false);
}