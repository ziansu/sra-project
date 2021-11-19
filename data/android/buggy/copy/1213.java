public void removeOneRoundEffects(cfvbaibai.cardfantasy.engine.Player activePlayer) {
    for (cfvbaibai.cardfantasy.engine.CardInfo card : activePlayer.getField().getAliveCards()) {
        this.removeStatus(card, CardStatusType.不屈);
    }
}