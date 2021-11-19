public void open() {
    db = desDBHelper.getWritableDatabase();
    isOpen = true;
    android.util.Log.d(net.deschulz.desdatabase0.DesDBManager.DEBUG_TAG, "desDBHelper opened");
}