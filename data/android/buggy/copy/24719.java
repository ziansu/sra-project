public void onClick(android.content.DialogInterface dialog, int which) {
    java.lang.String android_id = Settings.Secure.getString(context.getContentResolver(), Settings.Secure.ANDROID_ID);
    ph.rateNap(l.id(), which, android_id);
}