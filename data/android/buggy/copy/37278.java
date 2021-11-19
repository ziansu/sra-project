@java.lang.Override
public void visit(com.github.javaparser.ast.body.MethodDeclaration n, java.lang.Object args) {
    if (n.getComment().isPresent()) {
        hasComments(n);
    }else {
        noComments(n);
    }
}