private void unmarkCurrentProblemOfTheDay() {
    com.davidbalazs.chess.models.ChessProblemModel currentProblemOfTheDay = chessProblemDao.getProblemOfTheDay();
    currentProblemOfTheDay.setIsProblemOfTheDay(false);
    chessProblemDao.update(currentProblemOfTheDay);
}