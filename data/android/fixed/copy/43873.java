@java.lang.Override
public void onClick(android.view.View v) {
    new com.example.luc.controlbluetooth.HomePage.ConnectedThread(com.example.luc.controlbluetooth.HomePage.btSocket).start();
}