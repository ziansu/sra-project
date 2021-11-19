@org.junit.Test
public void hasJavaDocCommentNegativeCaseBlockComment() {
    com.github.javaparser.ast.body.ClassOrInterfaceDeclaration decl = new com.github.javaparser.ast.body.ClassOrInterfaceDeclaration(java.util.EnumSet.noneOf(com.github.javaparser.ast.Modifier.class), false, "Foo");
    decl.setComment(new com.github.javaparser.ast.comments.BlockComment("foo"));
    assertEquals(false, decl.hasJavaDocComment());
}