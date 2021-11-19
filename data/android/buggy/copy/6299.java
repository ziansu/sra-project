public int doAttack(com.slimekiller.main.Unit target) {
    int damageDealt = (attack) - (target.defence);
    target.subHealth(damageDealt);
    return damageDealt;
}