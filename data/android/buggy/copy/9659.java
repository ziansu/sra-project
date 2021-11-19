private org.encog.ml.prg.VariableMapping getResultType() {
    return ((org.encog.ml.prg.train.PrgPopulation) (getPopulation())).getContext().getResult();
}