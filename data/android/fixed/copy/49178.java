double cost(dstarlite.State a, dstarlite.State b) {
    dstarlite.StateInfo bInfo = S.get(b);
    return bInfo.getCost();
}