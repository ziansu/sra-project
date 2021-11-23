public void monsterClicked() {
    int gold;
    gold = mapPres.damageMonster(playerModel.getDamage());
    if (gold > 0) {
        playerModel.setMoney(((playerModel.getMoney()) + gold));
    }
}