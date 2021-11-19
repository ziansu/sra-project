@java.lang.Override
public void setTrumpCard(com.yan.durak.gamelogic.cards.Card card) {
    mTrumpCard = card;
    mCardNodes.get(mTrumpCard).setSortingLayer((-1));
}