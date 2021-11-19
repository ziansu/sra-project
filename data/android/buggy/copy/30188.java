public boolean isChromeGoogleSigned(android.content.Context context) {
    return isGoogleSigned(context.getApplicationContext().getPackageManager(), context.getPackageName());
}