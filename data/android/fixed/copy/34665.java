public void on_death() {
    health = 0;
    for (net.anorrah.items.bonus b : bonuses) {
        b.onDeath(this);
    }
    if ((health) <= 0) {
        java.lang.System.out.println("You are Dead");
        gk.stop();
    }
}