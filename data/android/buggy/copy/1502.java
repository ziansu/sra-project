@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_bluetooth__app);
    bT = new com.example.bluetooth_app.Bluetooth(this);
    bT.isCompat();
    bT.getAdapter();
    bT.pairedDevices();
}