public void onFinish() {
    if ((game.getNumberOfCompletedTricks()) != 10) {
        gameFragment.winnerHighlightToggle(((game.getTrickWinnerLocation()) + 1));
    }
}