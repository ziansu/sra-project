public java.util.Set<D> computeTargets(D source) {
    if (source == (zeroValue)) {
        return heros.flowfunc.Gen.twoElementSet(source, genValue);
    }else
        return java.util.Collections.singleton(source);
    
}