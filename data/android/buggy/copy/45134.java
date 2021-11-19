boolean shouldPreferSettersOverCtor(int noOfCtorArgs, int noOfSetters) {
    return (noOfCtorArgs * (((minPercentOfExcessiveSettersToPreferDefaultCtor) + 100.0F) / 100.0F)) <= noOfSetters;
}