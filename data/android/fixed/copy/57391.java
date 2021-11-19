@java.lang.Override
public smile.classification.DecisionTree.Node call() {
    return findBestSplit(n, count, impurity, j);
}