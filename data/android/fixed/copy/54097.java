@java.lang.Override
public void handleMessage(android.os.Message msg) {
    com.arksine.resremote.ArduinoCom.ArduinoMessage message = ((com.arksine.resremote.ArduinoCom.ArduinoMessage) (msg.obj));
    uInput.processInput(message.command, message.point);
}