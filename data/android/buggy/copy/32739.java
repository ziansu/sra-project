@java.lang.Override
public void run() {
    char winner;
    if ((winner = this.t.getDiagonalWinner()) != ' ') {
        java.lang.System.out.println((winner + " wins!"));
        t.join();
    }
}