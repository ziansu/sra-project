public java.lang.String getDeviceId() {
    try {
        return getITelephony().getDeviceId();
    } catch (android.os.RemoteException ex) {
        return null;
    }
}