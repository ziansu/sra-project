protected void init(java.util.List<? extends com.github.mikephil.charting.data.DataSet<?>> dataSets) {
    isLegal(dataSets);
    calcMinMax(dataSets);
    calcYValueSum(dataSets);
    calcYValueCount(dataSets);
    calcXValAverageLength();
}