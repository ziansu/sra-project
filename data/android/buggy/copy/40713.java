public static int getDeviceWidth(android.content.Context context) {
    android.view.WindowManager wm = ((android.view.WindowManager) (context.getSystemService(Context.WINDOW_SERVICE)));
    android.view.Display display = wm.getDefaultDisplay();
    return display.getWidth();
}