@java.lang.Override
public void protocolDidReceivePinCapability(int pin, int value) {
    java.lang.System.out.println(((("protocolDidReceivePinCapability - pin: " + pin) + "\tvalue: ") + value));
    android.util.Log.e(TAG, ((("protocolDidReceivePinCapability - pin: " + pin) + "\tvalue: ") + value));
}