public void removePage(java.lang.String diagramName) {
    final int pangeIndex = getPageIndex(diagramName);
    if (pangeIndex < 0) {
        return ;
    }
    removePage(getPageIndex(diagramName));
}