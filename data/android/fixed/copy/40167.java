public int levelForPoints(double skillPointsDouble) {
    int skillPoints = ((int) (skillPointsDouble));
    int level = 0;
    while ((pointsForLevel((level + 1))) <= skillPoints)
        level += 1;
    
    return level;
}