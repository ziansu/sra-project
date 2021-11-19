@java.lang.Override
public void appendMessage(lab3.Transfer t) throws java.rmi.RemoteException {
    _floatingMessages.get(t.getSnapshotToken()).add(t);
}