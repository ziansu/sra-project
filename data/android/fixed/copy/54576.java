public void showToast(java.lang.String text) {
    if ((mToast) != null)
        mToast.cancel();
    
    mToast = android.widget.Toast.makeText(this, text, Toast.LENGTH_LONG);
    mToast.show();
}