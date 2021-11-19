public void thirdChoiceMade(android.view.View view) {
    (level_move)++;
    if ((this.result_choices[3]) == 3) {
        updateScore();
    }
    timer.cancel();
    newMove();
}