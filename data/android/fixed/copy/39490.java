public void secondChoiceMade(android.view.View view) {
    (level_move)++;
    if ((this.result_choices[3]) == 2) {
        updateScore(true);
    }
    timer.cancel();
    newMove();
}