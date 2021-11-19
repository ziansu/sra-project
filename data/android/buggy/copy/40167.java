public int levelForPoints(double skillPointsDouble) {
    int skillPoints = ((int) (skillPointsDouble));
    int level = 0;
    while ((pointsForLevel(level)) < skillPoints)
        level += 1;
    
    return level;
}