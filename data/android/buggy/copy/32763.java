public void throwDarts(com.codeclan.sandy.Throw t) {
    if (isBust(t)) {
        t.score = 0;
    }
    if (t.isValid()) {
        this.currentScore -= t.score;
        this.scores.add(this.currentScore);
    }
}