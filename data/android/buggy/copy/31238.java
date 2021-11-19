private org.sosy_lab.cpachecker.cpa.invariants.CompoundInterval evaluate(org.sosy_lab.cpachecker.cpa.invariants.formula.NumeralFormula<org.sosy_lab.cpachecker.cpa.invariants.CompoundInterval> pFormula) {
    return pFormula.accept(new org.sosy_lab.cpachecker.cpa.invariants.formula.FormulaCompoundStateEvaluationVisitor(compoundIntervalManagerFactory), environment);
}