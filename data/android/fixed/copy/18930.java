@java.lang.Override
public java.lang.Boolean visit(org.lemsml.model.extended.TimeDerivative dx) throws org.lemsml.model.exceptions.LEMSCompilerException {
    buildDependenciesAndContext(dx, unitContext.get(dx.getVariable()).divide(tec.units.ri.util.SI.SECOND));
    return null;
}