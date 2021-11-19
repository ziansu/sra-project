public java.lang.Object evalFuncDecl(nez.ast.script.TypedTree node) {
    this.compiler.compileFuncDecl(node);
    return nez.ast.script.Interpreter.empty;
}