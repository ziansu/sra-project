public static synchronized java.util.List<org.openhab.binding.zwave.internal.ZWaveProduct> getProductIndex() {
    org.openhab.binding.zwave.internal.ZWaveConfigProvider.initialiseZWaveThings();
    return org.openhab.binding.zwave.internal.ZWaveConfigProvider.productIndex;
}