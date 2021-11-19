@java.lang.Override
public void run() {
    displayEndPiles(roundScores);
    manager.usedCards.addAll(manager.pot.values());
    potClear();
    displayPot();
    if ((currentPotTurn) == 12)
        finishedRound();
    
}