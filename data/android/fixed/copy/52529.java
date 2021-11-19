public void onKillMonster(entities.EntityMonster monster) {
    healPlayer(20);
    kills = (kills) + 1;
    giveExp();
    tryGiveWeapon(monster.getWeapon());
}