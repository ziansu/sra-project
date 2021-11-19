private void lost() {
    winStreak = 0;
    if ((curStars) == 0) {
        if ((currentRang) == (MIN_RANG)) {
            ++(currentRang);
        }
    }else {
        --(curStars);
    }
}