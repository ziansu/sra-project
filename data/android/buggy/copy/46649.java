private void setPlayerHandTypes(java.util.ArrayList<com.leonslegion.casino.CardGamePackage.PokerPlayer> remainingPlayers) {
    for (com.leonslegion.casino.CardGamePackage.PokerPlayer p : remainingPlayers) {
        p.getHand().determineHandType();
        java.lang.System.out.println(p.getHand().handType);
    }
}