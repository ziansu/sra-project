private kalang.core.ClassType requireClassType(java.lang.String name, org.antlr.v4.runtime.Token token) {
    kalang.ast.ClassNode ast = requireAst(name, token);
    return kalang.core.Types.getClassType(ast);
}