private void autoWeightSumIfAbsent() {
    if ((calculator.getWeightSum()) <= 0)
        calculator.setWeightSum(addedWeight);
    
}