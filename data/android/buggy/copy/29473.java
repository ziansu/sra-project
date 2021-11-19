public void attach() {
    android.util.Log.e(li.klass.fhem.util.UIBroadcastReceiver.class.getName(), "attach");
    activity.registerReceiver(this, intentFilter);
}