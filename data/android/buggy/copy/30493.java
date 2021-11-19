private void addToolbar() {
    javax.swing.JToolBar toolBar = new javax.swing.JToolBar("Toolbar", javax.swing.JToolBar.HORIZONTAL);
    addToolbarButtons(toolBar);
    toolBar.setFloatable(false);
    mainFrame.add(toolBar, java.awt.BorderLayout.PAGE_START);
}