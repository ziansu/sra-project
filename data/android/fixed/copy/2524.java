public void recieveBeatmap(music.Beatmap b) {
    setBackground(java.awt.Color.yellow);
    bmap = b;
    t = new java.lang.Thread(bmap);
    t.start();
}