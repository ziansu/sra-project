@java.lang.Override
public void writeExpression(dyvil.tools.compiler.backend.MethodWriter writer, dyvil.tools.compiler.ast.type.IType type) throws dyvil.tools.compiler.backend.exception.BytecodeException {
    if (dyvil.tools.compiler.ast.type.builtin.Types.isSameType(type, Types.VOID)) {
        return ;
    }
    writer.visitFieldInsn(Opcodes.GETSTATIC, "dyvil/lang/Void", "instance", "Ldyvil/lang/Void;");
}