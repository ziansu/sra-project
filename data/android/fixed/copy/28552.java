public void setSelected(int index) {
    if ((index + 1) >= (playerList.size())) {
        currentPlayerIndex = 0;
    }else {
        currentPlayerIndex = index + 1;
    }
    notifyDataSetChanged();
}