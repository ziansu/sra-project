private void initCard(com.cards.kifio.swipeablecards.SwipeableCard card, int position) {
    mAdapter.initCard(card, (isReverseOrder() ? (mAdapter.getCount()) - position : position));
}