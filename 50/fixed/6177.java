public void run() {
    java.lang.System.err.println((("BLACK: " + ((antiChess.AntiChess.timerLimit) - (antiChess.AntiChess.blackSeconds))) + "s left"));
    if ((antiChess.AntiChess.blackSeconds) >= (antiChess.AntiChess.timerLimit))
        antiChess.AntiChess.getWinner(java.awt.Color.WHITE);
    
    (antiChess.AntiChess.blackSeconds)++;
}