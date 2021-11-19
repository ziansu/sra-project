@java.lang.Override
public void updateShapes(java.util.Set<remote.IRemoteWBItem> shapes) throws java.rmi.RemoteException {
    this.paint.getShapes().addAll(shapes);
    this.paint.repaint();
    this.shapes.addAll(shapes);
}