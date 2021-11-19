public java.util.Set<edu.cmu.tetrad.sem.Node> getReferencingNodes(java.lang.String parameter) {
    java.util.Set<edu.cmu.tetrad.sem.Node> set = this.referencedParameters.get(parameter);
    return set == null ? new java.util.HashSet<edu.cmu.tetrad.sem.Node>() : new java.util.HashSet(set);
}