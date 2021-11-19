int increaseCapacity(int expectedCapacity) {
    maxCapacity = java.lang.Math.max(expectedCapacity, maxCapacity);
    return maxCapacity;
}