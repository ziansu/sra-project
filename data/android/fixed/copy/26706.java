@java.lang.Override
public rioko.drawmodels.configurations.AggregationAlgorithmConfiguration copy() {
    rioko.drawmodels.configurations.AggregationAlgorithmConfiguration res = new rioko.drawmodels.configurations.AggregationAlgorithmConfiguration();
    int index = this.algorithms.indexOf(currentAlgorithm);
    res.currentAlgorithm = res.algorithms.get((index == (-1) ? 0 : index));
    return res;
}