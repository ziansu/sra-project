@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    com.ihasama.ohtu.domain.Reference ref = new com.ihasama.ohtu.ui.ReferenceDialog("New Reference").showDialog();
    dao.add(ref);
    this.list.refresh();
    this.frame.pack();
}