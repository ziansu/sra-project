@java.lang.Override
public void protocolDidReceiveCustomData(int[] data, int length) {
    java.lang.System.out.println(("protocolDidReceiveCustomData: " + data));
    android.util.Log.e(TAG, ("protocolDidReceiveCustomData: " + data));
}