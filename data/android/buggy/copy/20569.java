@java.lang.Override
public void search(java.lang.String searchTerm) {
    de.hshannover.f4.trust.visitmeta.graphDrawer.Piccolo2DPanel.LOGGER.trace((("Search for '" + searchTerm) + "'"));
    mSearchTerm = searchTerm;
    repaintNodes(NodeType.IDENTIFIER, "");
    repaintNodes(NodeType.METADATA, "");
}