com.lightcrafts.ui.browser.folders.FolderTreeNode getSelectedNode() {
    javax.swing.tree.TreePath path = getSelectionPath();
    if (path != null) {
        com.lightcrafts.ui.browser.folders.FolderTreeNode node = ((com.lightcrafts.ui.browser.folders.FolderTreeNode) (path.getLastPathComponent()));
        return node;
    }
    return null;
}