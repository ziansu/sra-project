public void doubleDown(int i) {
    models.Game g = new models.Game();
    p.bet();
    hit(i);
    p.stay();
}