@java.lang.Override
public void onBluetoothListening() {
    if ((getGui()) == null) {
        return ;
    }
    getGui().onWaitingForOpponent();
}