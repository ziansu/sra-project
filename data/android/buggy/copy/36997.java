public void setCalcComplexity(thesis.pmd.fragment.initial.Complexity C) {
    this.loopComplexity = new thesis.pmd.fragment.initial.Complexity(C);
    thesis.pmd.fragment.initial.Complexity tempComp = new thesis.pmd.fragment.initial.Complexity(this.complexity);
    tempComp.multiply(this.loopComplexity);
    this.calcComplexity.multiply(tempComp);
}