public void onPower(android.view.View view) {
    if ((mPowerStatus) == false) {
        PowerOn(true);
        mPower = 0;
        SendData();
    }else {
        PowerOff(true);
    }
}