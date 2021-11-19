@java.lang.Override
public void removeShape(remote.IRemoteWBItem shape) throws java.rmi.RemoteException {
    this.paint.getShapes().remove(shape);
    this.paint.repaint();
    this.shapes.remove(shape);
}