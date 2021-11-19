public void startInfoActivity(java.lang.String textToShow) {
    android.content.Intent infoIntent = new android.content.Intent(getBaseContext(), com.example.qrhelper_android.InfoActivity.class);
    infoIntent.putExtra("qr_content", textToShow);
    startActivityForResult(infoIntent, 3);
}