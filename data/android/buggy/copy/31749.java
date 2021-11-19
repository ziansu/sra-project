@java.lang.Override
public void run() {
    getDefaultModel().insertNodeInto(node, parentNode, parentNode.getChildCount());
    expandPath(new javax.swing.tree.TreePath(node.getPath()));
}