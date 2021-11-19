@java.lang.Override
public void onScreenStarted() {
    android.util.Log.d(es.ulpgc.eite.clean.mvp.sample.listDoneMaster.TAG, "calling onScreenStarted()");
    checkAddBtnVisibility();
    checkDeleteBtnVisibility();
    checkDoneBtnVisibility();
}