public boolean gameOver() {
    java.lang.System.out.println("Capture - Game Over");
    for (Square square : squares) {
        if ((square != null) && (square.isDead())) {
            return true;
        }
    }
    return false;
}