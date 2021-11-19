public void setHitpoints() {
    (this.hitpoints)--;
    if ((getHitpoints()) == 0) {
        setSunk(true);
        IO.IO.println("Schiff wurde versenkt.");
    }
}