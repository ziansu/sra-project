@java.lang.Override
public void onFocusChange(android.view.View view, boolean b) {
    if (!(prevFocus.bool)) {
        showTagsDialog();
    }
    if (b) {
        prevFocus.bool = true;
    }else {
        prevFocus.bool = false;
    }
}