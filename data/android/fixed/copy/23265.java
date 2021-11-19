@java.lang.Override
public void protocolDidReceivePinMode(int pin, int mode) {
    java.lang.System.out.println(((("protocolDidReceivePinMode - pin: " + pin) + "\tmode: ") + mode));
    android.util.Log.e(TAG, ((("protocolDidReceivePinMode - pin: " + pin) + "\tmode: ") + mode));
}