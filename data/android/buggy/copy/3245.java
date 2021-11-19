public static void printMenu(com.nguyeningcode.blackjack.Hand hand) {
    java.lang.System.out.println("Please select one of the following options: \n");
    com.nguyeningcode.blackjack.BlackJackUtil.canStay(com.nguyeningcode.blackjack.Hand);
    com.nguyeningcode.blackjack.BlackJackUtil.canHit(com.nguyeningcode.blackjack.Hand);
    com.nguyeningcode.blackjack.BlackJackUtil.canDoubleDown(com.nguyeningcode.blackjack.Hand);
    com.nguyeningcode.blackjack.BlackJackUtil.canSplit(com.nguyeningcode.blackjack.Hand);
}