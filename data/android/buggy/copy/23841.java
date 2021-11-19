public void doubleDown(int i, models.Game g) {
    bet();
    g.hit(i);
    stay(g);
}