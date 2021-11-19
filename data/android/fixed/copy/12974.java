@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    selected.setUpdatePending(true);
    launch();
    instancesModel.update(true);
}