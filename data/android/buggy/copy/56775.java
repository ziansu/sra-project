@java.lang.Override
public void onAdClosed() {
    requestNewInterstitial();
    android.content.Intent intentStart = new android.content.Intent(getApplicationContext(), hantizlabs.jeuduroi.StartActivity.class);
    listeJoueurs.clearAllPlayers();
    startActivity(intentStart);
}