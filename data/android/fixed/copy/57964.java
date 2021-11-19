com.lightcrafts.ui.browser.folders.FolderTreeNode getSelectedNode() {
    javax.swing.tree.TreePath path = getSelectionPath();
    if (path != null) {
        return ((com.lightcrafts.ui.browser.folders.FolderTreeNode) (path.getLastPathComponent()));
    }
    return null;
}