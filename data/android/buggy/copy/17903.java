private void truncate_backlog_btnActionPerformed(java.awt.event.ActionEvent evt) {
    com.mergano.gui.BacklogDAO daobl = new com.mergano.gui.BacklogDAO();
    try {
        daobl.truncateBacklog();
        updateBacklog(daobl.getBacklogData());
    } catch (java.lang.Exception ex) {
    }
}