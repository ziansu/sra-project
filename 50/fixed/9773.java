@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    if ((connection) != null)
        connection.close();
    
    unregisterReceiver(btReceiver);
}