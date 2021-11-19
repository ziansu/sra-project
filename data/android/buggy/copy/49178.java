double cost(dstarlite.State a, dstarlite.State b) {
    dstarlite.StateInfo aInfo = S.get(a);
    dstarlite.StateInfo bInfo = S.get(b);
    return java.lang.Math.max(aInfo.getCost(), bInfo.getCost());
}