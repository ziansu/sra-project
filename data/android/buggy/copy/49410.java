public void ClearEvent(com.kmagic.solitaire.SolitaireView view) {
    view.removeCallbacks(this);
    mEvent = com.kmagic.solitaire.Rules.EVENT_INVALID;
    mCardAnchor = null;
    mCard = null;
}