private void initAdds() {
    mAdView = ((com.google.android.gms.ads.AdView) (findViewById(R.id.main_adView)));
    com.google.android.gms.ads.AdRequest adRequest = new com.google.android.gms.ads.AdRequest.Builder().build();
    mAdView.loadAd(adRequest);
}