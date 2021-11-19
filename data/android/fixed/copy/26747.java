public boolean gameOver() {
    if (((ballPosition) > 1) || ((ballPosition) < (-1))) {
        java.lang.System.out.println("Balance - Game Over");
        return true;
    }
    return false;
}