private int getNextDayColumnIndex(int currentDay, int currentIndex) {
    int sqlTableColumnIndex = currentIndex;
    if ((currentDay >= (com.concordia.mcga.helperClasses.MCGADayOfWeek.MONDAY)) && (currentDay < (com.concordia.mcga.helperClasses.MCGADayOfWeek.FRIDAY)))
        sqlTableColumnIndex += 1;
    else
        sqlTableColumnIndex -= 1;
    
    return sqlTableColumnIndex;
}