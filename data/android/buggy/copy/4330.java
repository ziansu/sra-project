@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    configShare.setPermitConnectMore(isChecked);
    com.e.ble.BLESdk.get().setPermitConnectMore(isChecked);
}