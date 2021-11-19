@android.annotation.SystemApi
public boolean getDataEnabled() {
    try {
        return getITelephony().getDataEnabled();
    } catch (android.os.RemoteException e) {
        android.util.Log.e(android.telephony.TelephonyManager.TAG, "Error calling ITelephony#getDataEnabled", e);
    } catch (java.lang.NullPointerException e) {
    }
    return false;
}