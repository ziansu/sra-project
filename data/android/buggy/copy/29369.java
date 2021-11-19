@java.lang.Override
public void dispose() {
    bndtools.central.Central.removeRepositoriesViewer(viewer, this);
    super.dispose();
}