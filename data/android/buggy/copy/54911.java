@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    api.deleteFavorite(1, this);
    api.deleteFavorite(2, this);
}