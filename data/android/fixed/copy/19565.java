public void stay(models.Game g) {
    int dealScore = g.getColScore(0);
    while (dealScore <= 16) {
        g.hit(0);
    } 
    return ;
}