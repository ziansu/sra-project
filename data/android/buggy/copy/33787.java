public java.lang.Object evalFuncDecl(nez.ast.script.TypedTree node) {
    nez.ast.script.asm.ScriptCompiler compiler = new nez.ast.script.asm.ScriptCompiler(this.base);
    compiler.compileFuncDecl(node);
    return nez.ast.script.Interpreter.empty;
}