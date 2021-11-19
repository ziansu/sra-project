public void onClick(android.view.View v) {
    android.content.Intent intentService = new android.content.Intent(this, org.yy.kyvb.VoiceBroadcastService.class);
    stopService(intentService);
    if ((cur_show_ad) != null) {
        cur_show_ad.hide();
        cur_show_ad = null;
    }
    finish();
}