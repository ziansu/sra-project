public final void decreaseMoves() {
    if (!(timeBased)) {
        --(moveCount);
        observer.updateSteps(moveCount);
        java.lang.System.out.println(remainingTime);
        if ((moveCount) <= 0) {
            observer.stopLevel();
        }
    }
}