@java.lang.Override
public void onClick(android.view.View view) {
    simpleBluetooth.sendData(dataToSend.getText().toString());
}