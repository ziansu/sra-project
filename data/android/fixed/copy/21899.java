public static void showToast(android.content.Context context, java.lang.String text, int duration) {
    if (context != null) {
        android.widget.Toast.makeText(context, text, duration).show();
    }
}