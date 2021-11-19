public void addItem(java.lang.String name) {
    com.project4D.fdpay.model.CardModel card = new com.project4D.fdpay.model.CardModel();
    card.setText(name);
    cardList.add(card);
    notifyDataSetChanged();
}