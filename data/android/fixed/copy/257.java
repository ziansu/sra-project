public Model.CombatResult combat() {
    Model.CombatResult result = this.currentPlayer.combat(this.currentMonster);
    Model.CardDealer.getInstance().giveMonsterBack(this.currentMonster);
    return result;
}