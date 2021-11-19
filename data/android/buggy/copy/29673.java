@java.lang.Override
public boolean checkTrigger(mage.game.events.GameEvent event, mage.game.Game game) {
    int inputValue = game.getBattlefield().countAll(filter, getControllerId(), game);
    return mage.constants.ComparisonType.compare(value, type, inputValue);
}