@java.lang.Override
public void onPause() {
    super.onPause();
    if (!((sbError) == null)) {
        if (sbError.isShown()) {
            sbError.dismiss();
        }
    }
}