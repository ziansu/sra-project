@java.lang.Override
public soot.spl.ifds.FlowFunction<D> getCallFlowFunction(de.fosd.typechef.parser.c.AST callStmt, de.fosd.typechef.conditional.Opt<de.fosd.typechef.parser.c.FunctionDef> destinationMethod) {
    return ifdsProblem.flowFunctions().getCallFlowFunction(callStmt, destinationMethod);
}