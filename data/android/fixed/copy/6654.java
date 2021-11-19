public void write(java.lang.String data) {
    com.example.PlanIT.BluetoothService.ConnectedThread r;
    synchronized(this) {
        if ((mState) != (com.example.PlanIT.BluetoothService.STATE_CONNECTED))
            return ;
        
        r = mConnectedThread;
    }
    r.write(data);
}