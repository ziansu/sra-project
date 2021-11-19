@java.lang.Override
protected void onResume() {
    super.onResume();
    ((org.multibluetooth.multibluetooth.Driving.Bluetooth.LaserScan.LaserScanner) (org.multibluetooth.multibluetooth.MainMenu.MainMenuActivity.btLaserCon)).setupService();
}