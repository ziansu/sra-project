@java.lang.Override
public void onBackPressed() {
    super.onBackPressed();
    hideSoftKeyboard();
    overridePendingTransition(R.animator.pull_left, R.animator.push_right);
    safeDestroySR();
    finish();
}