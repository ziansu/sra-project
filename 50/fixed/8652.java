public void checkStick(blackjack.Player player) {
    if ((player.checkHandValue()) > 21) {
        java.lang.System.out.println(((player.getName()) + " is bust!"));
        break;
    }
}