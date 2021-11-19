@java.lang.Override
public int getColour(java.lang.String markerName) throws android.os.RemoteException {
    return markers.get(markerName).getColor();
}