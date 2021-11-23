public void onKillMonster(entities.EntityMonster monster) {
    this.healPlayer(20);
    this.kills = (kills) + 1;
    giveExp();
    tryGiveWeapon(monster.getWeapon());
}