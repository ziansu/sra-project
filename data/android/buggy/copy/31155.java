public double getPercentTimeInColor(long totalTime, int numEquipment) {
    return (((double) (timeInColor)) / (((double) (totalTime)) * numEquipment)) * 100.0;
}