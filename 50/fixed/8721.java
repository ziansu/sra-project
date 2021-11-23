private void onStartAnimation() {
    android.view.View item = mFixedItem.get(itemId);
    itemAutoMove(item, mPerTranslateY, 2.0F);
    preItemId = itemId;
}