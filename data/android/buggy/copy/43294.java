public com.google.android.gms.ads.AdRequest getAdRequest() {
    return new com.google.android.gms.ads.AdRequest.Builder().addTestDevice(com.carlospinan.lolguide.helpers.Helper.ADS_DEVICE_TEST).build();
}