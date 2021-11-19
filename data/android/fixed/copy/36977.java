@java.lang.Override
protected void onRestoreInstanceState(android.os.Bundle savedInstanceState) {
    com.harlie.radiotheater.radiomysterytheater.utils.LogHelper.v(com.harlie.radiotheater.radiomysterytheater.BaseActivity.TAG, "onRestoreInstanceState");
    super.onRestoreInstanceState(savedInstanceState);
    this.restorePlayInfoFromBundle(savedInstanceState);
}