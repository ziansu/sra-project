@java.lang.Override
public void onLoaded(int versioncode) {
    if ((com.iron.dragon.sportstogether.BuildConfig.DEBUG) || ((com.iron.dragon.sportstogether.BuildConfig.VERSION_CODE) == versioncode)) {
        requestPermission(this);
    }else {
        showScreenToUpdate();
    }
}