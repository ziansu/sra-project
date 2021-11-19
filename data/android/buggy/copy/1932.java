@java.lang.Override
public void onError(java.lang.Throwable e) {
    showLoadingSpinner(false);
    showLoginErrorDialog();
    if ((e.getMessage()) == null) {
        android.util.Log.e("PokeNotify", e.getMessage());
    }
}