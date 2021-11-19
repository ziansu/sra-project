public void attack(kru.codefight.fighter.attacks.AbstractAttack attack) {
    boolean interrupted = resolveStun();
    if (!interrupted) {
        fighter.attack(attack);
    }
}