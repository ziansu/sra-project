public void bind(com.lcanaveral.movile.traktapp.ui.episodes.Episode episode) {
    setNestedScrollingEnabled(false);
    title.setText(episode.title);
    number.setText(("E" + (episode.number)));
}