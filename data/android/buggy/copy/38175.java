private void setupCards() {
    cardViewModelList.add(new com.ig.igtradinggame.ui.cards.balance.BalanceCardViewModel(50));
    adapter.notifyDataSetChanged();
    startUpdatingBalance(0);
}