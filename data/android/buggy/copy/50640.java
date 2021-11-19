private int selectBestValue() {
    double[] table = getCostTableSum((-1));
    table[1] += weight;
    int val_idx = agent.BinaryCCG.Commons.getArgMin(table);
    return getAgentView().getDomainElement(val_idx);
}