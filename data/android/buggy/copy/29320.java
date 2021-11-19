public void close() {
    if ((desDBHelper) != null) {
        isOpen = false;
        desDBHelper.close();
        android.util.Log.d(net.deschulz.desdatabase0.DesDBManager.DEBUG_TAG, "desDBbHelper closed");
    }
}