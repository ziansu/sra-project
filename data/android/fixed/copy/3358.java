@java.lang.Override
public void onDestroy() {
    android.util.Log.i("onDestroy", category);
    galleryPresenter.destroy();
    super.onDestroy();
}