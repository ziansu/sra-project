private void loadBanner(int i) {
    mAdView = ((com.google.android.gms.ads.AdView) (findViewById(R.id.adBanner)));
    com.google.android.gms.ads.AdRequest adRequest = new com.google.android.gms.ads.AdRequest.Builder().addTestDevice("2C75B378313C32C7D50757BB562FF544").build();
    mAdView.loadAd(adRequest);
}