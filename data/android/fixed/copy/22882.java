static void pop(dyvilx.tools.compiler.backend.MethodWriterImpl writer) throws dyvilx.tools.compiler.backend.exception.BytecodeException {
    java.lang.Object t = writer.frame.pop();
    if (dyvilx.tools.compiler.backend.BackendUtil.twoWord(t)) {
        writer.mv.visitInsn(dyvilx.tools.compiler.backend.POP2);
    }else {
        writer.mv.visitInsn(dyvilx.tools.compiler.backend.POP);
    }
}