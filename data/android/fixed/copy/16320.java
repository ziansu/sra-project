@java.lang.Override
protected void promptPlayerToBuy(com.monopoly.logic.events.Event event) {
    monopolBoard.promptPlayerToBuy(event.getEventMessage(), playerBuyAssetDecision, event.getEventID());
}