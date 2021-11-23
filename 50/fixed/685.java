public static synchronized java.util.List<org.openhab.binding.zwave.internal.ZWaveProduct> getProductIndex() {
    if ((org.openhab.binding.zwave.internal.ZWaveConfigProvider.productIndex.size()) == 0) {
        org.openhab.binding.zwave.internal.ZWaveConfigProvider.initialiseZWaveThings();
    }
    return org.openhab.binding.zwave.internal.ZWaveConfigProvider.productIndex;
}