@java.lang.Override
protected void onStop() {
    super.onStop();
    if ((mFavorites) != null) {
        com.garpr.android.misc.FavoritesStore.write(mFavorites);
    }
}