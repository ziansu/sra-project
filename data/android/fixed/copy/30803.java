private void changeCurrentQuizz() {
    quizzService.changeCurrentQuizz();
    heroService.resetBonusForAll();
}