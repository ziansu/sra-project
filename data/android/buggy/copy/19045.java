public void playGame() {
    while ((hasChips()) && (userWantsToContinue())) {
        playHand();
    } 
    java.lang.System.exit(0);
}