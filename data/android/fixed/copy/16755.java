public static int statTotal() {
    int sum = 0;
    for (int i = 0; i < 5; i++) {
        sum += net.shooter.InterstellarCombat.buffs[i];
    }
    return sum;
}