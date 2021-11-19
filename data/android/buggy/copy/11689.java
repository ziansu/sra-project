private java.util.List<org.sosy_lab.solver.api.BooleanFormula> recursivelyCallSelf(org.sosy_lab.solver.api.BooleanFormula f) {
    return getSelectorsToAbstract(toAbstract, m, selectionInfo, f, org.sosy_lab.common.log.NullLogManager.getInstance(), (depth + 1));
}