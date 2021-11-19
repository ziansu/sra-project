@java.lang.Override
public void performTasks(com.app.Player currentPlayer) {
    java.lang.System.out.println("Player discards one card..");
    this.discardCard(currentPlayer);
    java.lang.System.out.println("Taking $2 from bank..");
    this.takeLoanFromBank((+2), currentPlayer);
}