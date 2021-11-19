public void setBehavior(net.demilich.metastone.game.behaviour.IBehaviour behavior) {
    context.getPlayer1().setBehaviour(behavior.clone());
    context.getPlayer2().setBehaviour(behavior.clone());
}