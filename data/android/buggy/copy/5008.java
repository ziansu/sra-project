public net.demilich.metastone.game.spells.TargetPlayer getSourcePlayer() {
    return contains(EventTriggerArg.SOURCE_PLAYER) ? ((net.demilich.metastone.game.spells.TargetPlayer) (get(EventTriggerArg.SOURCE_PLAYER))) : net.demilich.metastone.game.spells.TargetPlayer.SELF;
}