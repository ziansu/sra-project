public void setTreeName(java.lang.String treeName) {
    this.treeName = new javax.swing.JLabel(treeName);
    cleanButton.setEnabled(((treeName.compareTo("ACTIVE")) != 0));
    treeButtonsContainer.revalidate();
    treeButtonsContainer.repaint();
}