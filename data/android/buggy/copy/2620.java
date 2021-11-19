@java.lang.Override
protected void onPostExecute(java.util.ArrayList<java.lang.String> collections) {
    adapterCollections.clear();
    if ((adapterCollections) == null) {
        android.util.Log.i(hestia.UI.dialogs.AddDeviceDialog.TAG, "adapterCollections became null?");
    }
    adapterCollections.addAll(collections);
}