public void actionPerformed(java.awt.event.ActionEvent event) {
    p.play();
    Soundboard.getInstance().nowPlaying(this);
}