@java.lang.Override
public void onFocusChange(android.view.View v, boolean hasFocus) {
    if (!hasFocus) {
        ((android.app.Activity) (v.getContext())).onBackPressed();
        mSearchName = search.getText().toString();
    }
}