public be.cegeka.battle.FightingSoldier attack(be.cegeka.battle.FightingSoldier defender) {
    if (attackerWins(defender)) {
        defender.killSoldier();
        return this;
    }
    return defender;
}