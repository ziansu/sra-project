public void onDeviceConnected(java.lang.String name, java.lang.String address) {
    connect.setEnabled(true);
    connect.setText(("Connected to " + name));
}