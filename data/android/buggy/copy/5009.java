@java.lang.Override
protected void beforeParent(ir.cfgraph.CodePoint codePoint) {
    java.util.Set<java.lang.String> liveSet = livenessMap.get(codePoint);
    previousLivenessFlags.addAll(liveSet);
    for (java.lang.String deadId : statementVisitor.getDeadSet())
        previousLivenessFlags.remove(deadId);
    
}