public void acquire() {
    if ((map.getPacMan()) != null) {
        map.getPacMan().increaseScore(pointValue);
    }
}