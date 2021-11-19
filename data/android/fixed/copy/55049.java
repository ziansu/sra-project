public void setPositionIncentiveView(int position) {
    if (((decksList) != null) && ((decksList.size()) >= position)) {
        decksList.add(position, "Incentive view");
    }
}