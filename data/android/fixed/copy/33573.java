@java.lang.Override
public void onPause() {
    super.onPause();
    presenter.onDestroy();
}