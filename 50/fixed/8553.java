private void kurangiscore() {
    if ((score) < 1) {
    }else {
        score -= 5;
        java.lang.String scoreString = java.lang.Integer.toString(score);
        scoretext.setText(scoreString);
        animateScore();
    }
}