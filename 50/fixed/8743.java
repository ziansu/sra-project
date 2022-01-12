private void hideAllViewExceptKeyBoard() {
    for (int i = 0; i < (showViewList.size()); i++) {
        hideView(showViewList.get(i));
    }
}