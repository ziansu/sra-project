public static void navigateToLocationSettings(android.content.Context context) {
    context.startActivity(new android.content.Intent(android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS));
}