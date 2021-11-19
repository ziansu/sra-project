@java.lang.Override
public void onClick(android.view.View view) {
    stopService(serviceIntent);
    serviceIntent.putExtra("tabNum", 2);
    serviceIntent.putExtra("serviceName", "Stand");
    startService(serviceIntent);
}