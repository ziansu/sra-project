@org.androidannotations.annotations.AfterViews
void afterViews() {
    com.google.android.gms.ads.AdView mAdView = ((com.google.android.gms.ads.AdView) (findViewById(R.id.adView)));
    com.google.android.gms.ads.AdRequest adRequest = new com.google.android.gms.ads.AdRequest.Builder().build();
    mAdView.loadAd(adRequest);
}