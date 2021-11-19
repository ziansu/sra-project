public no.runsafe.framework.api.player.IPlayer getPlayer() {
    return no.runsafe.framework.internal.Player.Get().getExact(event.getName());
}