@java.lang.Override
public void onClick(android.view.View view) {
    if (isConnected) {
        simpleBluetooth.sendData(dataToSend.getText().toString());
    }
}