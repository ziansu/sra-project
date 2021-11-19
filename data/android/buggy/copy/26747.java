public boolean gameOver() {
    java.lang.System.out.println("Balance - Game Over");
    return ((ballPosition) > 1) || ((ballPosition) < (-1));
}