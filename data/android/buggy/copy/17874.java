public void reaction() {
    nbasim.Team defense = game.other(offense);
    if (made) {
        offense.limbo();
        defense.limbo();
    }else {
        offense.defense();
        defense.offense();
    }
}