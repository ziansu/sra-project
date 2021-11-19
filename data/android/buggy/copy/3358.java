@java.lang.Override
public void onDestroy() {
    android.util.Log.d("onDestroy", category);
    galleryPresenter.destroy();
    super.onDestroy();
}