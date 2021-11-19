public void dealerTurn() {
    int dealer_limit = 17;
    int dealer_hand_value = dealer.fetchHandValue();
    while (dealer_hand_value < dealer_limit) {
        hit(dealer);
        dealer_hand_value = dealer.fetchHandValue();
    } 
}