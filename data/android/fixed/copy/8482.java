private int threatLevelCalculator(int armorRating, int potionEffectRating) {
    int threatLevel = (armorRating / 2) + potionEffectRating;
    return threatLevel;
}