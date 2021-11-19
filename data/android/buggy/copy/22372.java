public ast.AST subst(ast.AST ast, java.lang.String name) {
    return new ast.tests.IsTerm(value.subst(ast, name), name, arity);
}