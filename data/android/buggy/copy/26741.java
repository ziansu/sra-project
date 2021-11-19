public final boolean hasBluetoothLe() {
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.JELLY_BEAN_MR2)) {
        return context.getPackageManager().hasSystemFeature(PackageManager.FEATURE_BLUETOOTH_LE);
    }else {
        return false;
    }
}