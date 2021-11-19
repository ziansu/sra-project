public static void closeApp(android.content.Context context) {
    android.widget.Toast.makeText(context, ((com.familyparking.app.utility.Tools.getAppName(context)) + " cannot work without location services!"), Toast.LENGTH_LONG).show();
    ((android.app.Activity) (context)).finish();
}