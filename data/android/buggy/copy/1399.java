public void hit(int damage) {
    currentHull -= damage;
    if ((currentHull) <= 0) {
        die();
    }
}