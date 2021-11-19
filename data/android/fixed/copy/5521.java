@org.junit.Test
public void testProj() {
    com.jetbrains.jetpad.vclang.term.definition.FunctionDefinition fun = ((com.jetbrains.jetpad.vclang.term.definition.FunctionDefinition) (typeCheckDef("\\function f : Nat => (\\lam (p : \\Sigma Nat Nat) => p.2) (1, 2)")));
    ok(fun.getElimTree(), Nat());
}