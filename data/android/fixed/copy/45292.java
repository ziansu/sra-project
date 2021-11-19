public void valueChanged(javax.swing.event.ListSelectionEvent e) {
    javax.swing.ListSelectionModel lsm = ((javax.swing.ListSelectionModel) (e.getSource()));
    int firstIndex = lsm.getLeadSelectionIndex();
    myItemIndex = firstIndex;
}