private void Damage(boolean player, int damage) {
    playerHp[(player ? 1 : 0)] -= damage;
    return ;
}