public int getUnitProfit() {
    if ((unitProfit) == 0) {
        int profit = (new org.powerbot.script.rt6.GeItem(cleanId).price) - (new org.powerbot.script.rt6.GeItem(grimyId).price);
        setUnitProfit(profit);
    }
    return unitProfit;
}