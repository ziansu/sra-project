@java.lang.Override
public void onClick(android.view.View view) {
    stopService(serviceIntent);
    serviceIntent.putExtra("tabNum", 0);
    serviceIntent.putExtra("serviceName", "Stand");
    startService(serviceIntent);
}