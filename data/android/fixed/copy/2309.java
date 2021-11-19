void resetMonsterHealth() {
    for (int r = 0; r <= ((MonsterOrganization.monsterHealth.length) - 1); r++) {
        MonsterOrganization.monsterHealth[r] = MonsterOrganization.MONSTER_HEALTH_START[r];
    }
}