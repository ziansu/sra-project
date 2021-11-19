public de.uni_freiburg.informatik.ultimate.logic.TermVariable addInVar(final de.uni_freiburg.informatik.ultimate.modelcheckerutils.cfg.variables.IProgramVar key, final de.uni_freiburg.informatik.ultimate.logic.TermVariable value) {
    if (mConstructionFinished) {
        return mInVars.put(key, value);
    }else {
        throw new java.lang.IllegalStateException("Construction finished, TransFormula must not be modified.");
    }
}