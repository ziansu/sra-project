private void btnEditBuildActionPerformed(java.awt.event.ActionEvent evt) {
    java.lang.String[] choices = new java.lang.String[]{ "Build 1" , "Build 2" , "Build 3" };
    new ManageBuild(currentUser, null).setVisible(true);
    this.setVisible(false);
}