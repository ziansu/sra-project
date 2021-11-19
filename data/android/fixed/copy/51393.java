@java.lang.Override
public void onDisconnect() {
    disconnect((!(useClientMode)));
    super.onDisconnect();
}