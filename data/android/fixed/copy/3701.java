@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    BinarySearchTree<java.lang.String> binarySearchTree = new BinarySearchTree();
    frame.setVisible(false);
    frame.dispose();
    new GUITree(1000, binarySearchTree);
}