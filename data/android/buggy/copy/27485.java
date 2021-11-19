int LAC() {
    return ((android.telephony.gsm.GsmCellLocation) (((android.telephony.TelephonyManager) (getSystemService(Context.TELEPHONY_SERVICE))).getCellLocation())).getLac();
}