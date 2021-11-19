public void addMainPageToTheMainFrame() {
    mainFrame.getContentPane().add(java.awt.BorderLayout.CENTER, buildMainPage());
    mainFrame.validate();
}