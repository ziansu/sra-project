public static int getXPFromLevel(int level) {
    int lCount = 0;
    int totalXP = 0;
    while (lCount <= level)
        totalXP += am2.utility.EntityUtilities.xpBarCap((lCount++));
    
    return totalXP;
}