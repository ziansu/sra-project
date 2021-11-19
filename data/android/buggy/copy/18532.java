public void PostEvent(com.kmagic.solitaire.SolitaireView view, int event, com.kmagic.solitaire.CardAnchor anchor, com.kmagic.solitaire.Card card) {
    mEvent = event;
    mCardAnchor = anchor;
    mCard = card;
    view.post(this);
}