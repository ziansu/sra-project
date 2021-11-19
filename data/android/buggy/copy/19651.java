@java.lang.Override
public void onResume() {
    super.onResume();
    android.util.Log.i("HERE", "start called.");
    mPresenter.start();
}