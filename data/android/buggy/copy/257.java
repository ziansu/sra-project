public Model.CombatResult combat() {
    Model.CardDealer.getInstance().giveMonsterBack(this.currentMonster);
    return this.currentPlayer.combat(this.currentMonster);
}