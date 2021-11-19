public int doAttack(com.slimekiller.main.Unit target) {
    int damageDealt = (((attack) - (target.defence)) <= 0) ? 0 : (attack) - (target.defence);
    target.subHealth(damageDealt);
    return damageDealt;
}