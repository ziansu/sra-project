@org.junit.Test
public void testFeatureMaskTranslation() {
    int caps = (IWifiStaIface.StaIfaceCapabilityMask.BACKGROUND_SCAN) | (IWifiStaIface.StaIfaceCapabilityMask.LINK_LAYER_STATS);
    int expected = ((android.net.wifi.WifiManager.WIFI_FEATURE_INFRA) | (android.net.wifi.WifiManager.WIFI_FEATURE_SCANNER)) | (android.net.wifi.WifiManager.WIFI_FEATURE_LINK_LAYER_STATS);
    assertEquals(expected, mWifiVendorHal.wifiFeatureMaskFromStaCapabilities(caps));
}