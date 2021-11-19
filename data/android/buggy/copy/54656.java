@java.lang.Override
public void onBluetoothListening() {
    if ((getGui()) == null) {
        return ;
    }
    getGui().onWaitingForOpponent(mContext.getString(R.string.waiting_for_a_bluetooth_opponent_to_connect));
}