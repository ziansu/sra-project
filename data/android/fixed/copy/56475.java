@java.lang.Override
public void onConnectionError(java.lang.Throwable throwable) {
    temp.setText("Connection error");
    throwable.printStackTrace();
}