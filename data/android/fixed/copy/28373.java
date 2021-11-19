public java.util.Set<D> computeTargets(D source) {
    if (source.equals(zeroValue)) {
        return heros.flowfunc.Gen.twoElementSet(source, genValue);
    }else {
        return java.util.Collections.singleton(source);
    }
}