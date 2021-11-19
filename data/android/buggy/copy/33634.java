public int getTimeStep(org.jLOAF.casebase.Case c) {
    return ((this.getRunLength()) - 1) - (this.run.indexOf(c));
}