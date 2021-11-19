private void unmarkCurrentProblemOfTheDay() {
    com.davidbalazs.chess.models.ChessProblemModel currentProblemOfTheDay = chessProblemDao.getProblemOfTheDay();
    if (currentProblemOfTheDay != null) {
        currentProblemOfTheDay.setIsProblemOfTheDay(false);
        chessProblemDao.update(currentProblemOfTheDay);
    }
}