public int calculateAttack(Player player) {
    int min = (player.Attack) - 2;
    int max = (-(player.Attack)) + 2;
    return (rand.nextInt((max - min))) + min;
}