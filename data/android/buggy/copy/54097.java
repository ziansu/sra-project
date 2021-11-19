@java.lang.Override
public void handleMessage(android.os.Message msg) {
    com.arksine.resremote.ArduinoCom.ArduinoMessage message = parseBytes(((byte[]) (msg.obj)), msg.arg1);
    uInput.processInput(message.command, message.point);
}