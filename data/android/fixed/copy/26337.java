public int rollDie() {
    value = game.Die.diceValues[game.Die.index];
    (game.Die.index)++;
    game.Die.index = (game.Die.index) % (game.Die.diceValues.length);
    return value;
}