public static double doubleMean(final java.util.List<java.lang.Double> doubleList) {
    if (doubleList.isEmpty())
        return 0.0;
    
    double sum = playground.agarwalamit.utils.ListUtils.doubleSum(doubleList);
    return sum / (doubleList.size());
}