@java.lang.Override
public void onTimeout() {
    updateText(root, R.id.init_res, getString(R.string.timeout));
}