public void setShareScreenSwitch(boolean isGroupOwner) {
    if ((mShareScreenSwitch) != null) {
        mShareScreenSwitch.setOnCheckedChangeListener(null);
        mShareScreenSwitch.setChecked(isGroupOwner);
        mShareScreenSwitch.setOnCheckedChangeListener(mShareScreenSwitchListener);
    }
}