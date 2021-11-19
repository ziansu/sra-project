private void switchState() {
    if (mSwitchState) {
        mVacationSwitch.setChecked(true);
    }else {
        mVacationSwitch.setChecked(false);
        changeTemperatureAllButtonsEnable(false);
    }
}