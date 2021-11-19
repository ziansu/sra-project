@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    pi.setVisibility(View.GONE);
    getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
    this.finish();
}