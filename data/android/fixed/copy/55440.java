@java.lang.Override
public void showLoadFailed(java.lang.String msg) {
    if ((rootView) != null) {
        com.dante.knowledge.utils.UI.showSnackLong(rootView, R.string.load_fail);
    }
}