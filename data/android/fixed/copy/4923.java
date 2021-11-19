tnc16_coh5_d_r273.blind_blackjack.Card popCard(byte a) {
    tnc16_coh5_d_r273.blind_blackjack.Card card = hand.get(a);
    hand.remove(a);
    return card;
}