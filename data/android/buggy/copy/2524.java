public void recieveBeatmap(music.Beatmap b) {
    setBackground(java.awt.Color.yellow);
    bmap = b;
    new java.lang.Thread(bmap).start();
}