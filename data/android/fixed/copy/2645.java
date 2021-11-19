public void arrayRetrieve(exm.stc.common.lang.Var dst, exm.stc.common.lang.Var arrayVar, exm.stc.common.lang.Arg arrIx) {
    currBlock().addInstruction(exm.stc.ic.tree.TurbineOp.arrayRetrieve(dst, arrayVar, arrIx));
}