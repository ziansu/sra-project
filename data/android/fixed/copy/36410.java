public void onSongPrevious(android.view.View view) {
    if ((musicService) != null) {
        musicService.previous();
        setPlayerTitleText();
    }
}