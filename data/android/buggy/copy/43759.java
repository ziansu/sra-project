@java.lang.Override
public void onClick(android.view.View view) {
    geofenceName.setError(null);
    android.view.inputmethod.InputMethodManager imm = ((android.view.inputmethod.InputMethodManager) (getSystemService(Context.INPUT_METHOD_SERVICE)));
    imm.showSoftInput(geofenceRadius, InputMethodManager.SHOW_IMPLICIT);
}