@java.lang.Override
public rioko.drawmodels.configurations.LayoutAlgorithmConfiguration copy() {
    rioko.drawmodels.configurations.LayoutAlgorithmConfiguration res = new rioko.drawmodels.configurations.LayoutAlgorithmConfiguration();
    int index = this.indexOf(this.currentAlgorithm);
    res.currentAlgorithm = res.algorithms.get((index == (-1) ? 0 : index));
    return res;
}