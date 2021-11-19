static java.lang.String getLimitTracking(android.content.Context context) {
    try {
        return com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(context).isLimitAdTrackingEnabled();
    } catch (java.lang.Exception e) {
        android.util.Log.e("CS_SDK", "Failed to get isLimitAdTrackingEnabled", e);
        return null;
    }
}