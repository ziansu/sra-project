@java.lang.Override
public void cardPlayed(org.smartreaction.battletechdomination.model.players.Player player) {
    player.addActions(2);
    player.addAction(new org.smartreaction.battletechdomination.model.cards.actions.ScrapCardsFromHandOrDiscardPileForBenefit(this, 2, "Scrap up to 2 Resource cards from your hand and/or discard pile to draw a card for each card scrapped.", true));
}