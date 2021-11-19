public void throwDarts(com.codeclan.sandy.Throw t) {
    if ((t.isValid()) && (!(isBust(t)))) {
        this.currentScore -= t.score;
        this.scores.add(this.currentScore);
    }
}