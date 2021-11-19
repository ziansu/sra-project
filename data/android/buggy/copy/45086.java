@java.lang.Override
protected android.content.Intent onFillDeviceDetailIntent(android.content.Context context, li.klass.fhem.domain.core.FhemDevice device, android.content.Intent intent) {
    intent.putExtra(BundleExtraKeys.FRAGMENT, FragmentType.FLOORPLAN);
    intent.putExtra(BundleExtraKeys.DEVICE_NAME, device.getName());
    return intent;
}