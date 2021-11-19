protected happy.coding.io.LineConfiger getModelParams(java.lang.String algoName) {
    return librec.intf.Recommender.cf.contains(algoName) ? librec.intf.Recommender.cf.getParamOptions(algoName) : null;
}