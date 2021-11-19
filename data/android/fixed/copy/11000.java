private void quitTinyScreen(android.view.ViewGroup itemContainer) {
    if (itemContainer != null) {
        mXibaVideoPlayer.quitTinyScreen(itemContainer);
    }else {
        mXibaVideoPlayer.quitTinyScreen();
    }
    mXibaVideoPlayer.setTinyScreenEventCallback(null);
    savePlayerInfo();
}