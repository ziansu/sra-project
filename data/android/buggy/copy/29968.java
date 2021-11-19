@java.lang.Override
public Abstract.Expression makeDefCall(com.jetbrains.jetpad.vclang.term.Abstract.Expression expr, com.jetbrains.jetpad.vclang.term.Abstract.ReferableSourceNode alias, com.jetbrains.jetpad.vclang.term.definition.Definition definition) {
    return cDefCall(((com.jetbrains.jetpad.vclang.term.Concrete.Expression) (expr)), definition, ((com.jetbrains.jetpad.vclang.term.Concrete.ReferableSourceNode) (alias)).getName());
}