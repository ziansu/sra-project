@java.lang.Override
public boolean apply(mage.game.Game game, mage.abilities.Ability source) {
    return !(game.getOpponents(source.getControllerId()).contains(game.getActivePlayerId()));
}