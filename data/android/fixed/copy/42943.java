public void getDealtHand() {
    Message handDealt = SERVER.getMessage("get dealt hand");
    HAND = handDealt.getHandDealt();
    java.lang.System.out.println(("Recieved Dealt Hand: " + (HAND.toString())));
}