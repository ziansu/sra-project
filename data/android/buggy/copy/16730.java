private static boolean hasAnnotations(com.puppycrawl.tools.checkstyle.api.DetailAST modifierNode) {
    return (modifierNode.findFirstToken(TokenTypes.ANNOTATION)) != null;
}