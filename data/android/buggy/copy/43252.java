public void firstChoiceMade(android.view.View view) {
    (level_move)++;
    if ((this.result_choices[3]) == 1) {
        updateScore();
    }
    timer.cancel();
    newMove();
}