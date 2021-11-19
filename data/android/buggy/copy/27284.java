@java.lang.Override
public void onError(java.lang.Throwable e) {
    if (name.gudong.translate.BuildConfig.DEBUG) {
        e.printStackTrace();
    }
    mView.onError(e);
}