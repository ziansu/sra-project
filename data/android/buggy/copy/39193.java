@org.junit.Test
public void hasJavaDocCommentNegativeCaseNoComment() {
    com.github.javaparser.ast.body.ClassOrInterfaceDeclaration decl = new com.github.javaparser.ast.body.ClassOrInterfaceDeclaration(java.util.EnumSet.noneOf(com.github.javaparser.ast.Modifier.class), false, "Foo");
    org.junit.Assert.assertEquals(false, decl.hasJavaDocComment());
}