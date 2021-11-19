public int increaseTime() {
    (time)++;
    if ((time) > 5) {
        time = 0;
        generateRandomEnemies();
    }
}