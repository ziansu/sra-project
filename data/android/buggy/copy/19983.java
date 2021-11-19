public void stopVideo() {
    fab.setVisibility(View.GONE);
    save.setVisibility(View.GONE);
    slideToTop(youTubeView);
    showInfo();
    while (player.hasNext()) {
        player.next();
    } 
}