@java.lang.Override
protected void promptPlayerToBuy(com.monopoly.logic.events.Event event) {
    monopolBoard.promtPlayerToBuy(event.getEventMessage(), playerBuyAssetDecision, event.getEventID());
}