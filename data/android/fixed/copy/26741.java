public final boolean hasBluetoothLe() {
    return ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.JELLY_BEAN_MR2)) && (context.getPackageManager().hasSystemFeature(PackageManager.FEATURE_BLUETOOTH_LE));
}