@java.lang.Override
public boolean findBinding(com.jetbrains.jetpad.vclang.term.definition.Referable binding) {
    return this.<java.lang.Void, java.lang.Boolean>accept(new com.jetbrains.jetpad.vclang.term.expr.FindBindingVisitor(java.util.Collections.singleton(binding)), null);
}