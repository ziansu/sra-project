@java.lang.Override
public void onPwsResultAbsent(java.lang.String url) {
    android.widget.Toast.makeText(getApplicationContext(), getString(R.string.shorten_error), Toast.LENGTH_LONG).show();
    stopSelf();
    return ;
}