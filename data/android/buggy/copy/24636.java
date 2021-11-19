@org.junit.Test
public void hasJavaDocCommentPositiveCaseWithSetComment() {
    com.github.javaparser.ast.body.ClassOrInterfaceDeclaration decl = new com.github.javaparser.ast.body.ClassOrInterfaceDeclaration(java.util.EnumSet.noneOf(com.github.javaparser.ast.Modifier.class), false, "Foo");
    decl.setComment(new com.github.javaparser.ast.comments.JavadocComment("A comment"));
    org.junit.Assert.assertEquals(true, decl.hasJavaDocComment());
}