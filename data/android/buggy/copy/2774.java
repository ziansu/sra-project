public boolean addWater(int liters) {
    int newAmountInLiters = (currentAmountInLiters) + liters;
    if (newAmountInLiters > (maxCapacityInLiters)) {
        currentAmountInLiters = maxCapacityInLiters;
        return false;
    }else {
        currentAmountInLiters = newAmountInLiters;
        return true;
    }
}