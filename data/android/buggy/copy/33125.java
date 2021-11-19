@java.lang.Override
public void writeExpression(dyvil.tools.compiler.backend.MethodWriter writer, dyvil.tools.compiler.ast.type.IType type) throws dyvil.tools.compiler.backend.exception.BytecodeException {
    assert (this.writer) != null : "Dummy value did not specify writer";
    this.writer.accept(writer, type);
}