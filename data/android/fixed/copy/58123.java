public void addInVars(final java.util.Map<? extends de.uni_freiburg.informatik.ultimate.modelcheckerutils.cfg.variables.IProgramVar, ? extends de.uni_freiburg.informatik.ultimate.logic.TermVariable> m) {
    if (mConstructionFinished) {
        throw new java.lang.IllegalStateException("Construction finished, TransFormula must not be modified.");
    }else {
        mInVars.putAll(m);
    }
}