public void stay() {
    models.Game g = new models.Game();
    int dealScore = g.getColScore(0);
    while (dealScore <= 16) {
        g.hit(0);
    } 
}