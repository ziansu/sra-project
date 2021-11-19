@java.lang.Override
public boolean canFireCondition(net.demilich.metastone.game.events.GameEvent event) {
    return expirationTrigger.canFireCondition(event);
}