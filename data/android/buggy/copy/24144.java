private static void requestAd() {
    com.google.android.gms.ads.AdRequest adRequest = new com.google.android.gms.ads.AdRequest.Builder().build();
    com.tomade.saufomat.AdService.interstitialAd.loadAd(adRequest);
    android.util.Log.i(com.tomade.saufomat.AdService.TAG, "new InterstitialAd requested");
}