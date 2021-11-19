public void receiveWinnings(int winnings, int bet) {
    if (winnings < 0)
        throw new java.lang.IllegalArgumentException("Winnings cannot be negative.");
    
    balance = (balance) + winnings;
}