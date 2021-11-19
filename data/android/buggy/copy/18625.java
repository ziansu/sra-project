public com.dickimawbooks.texparserlib.latex.TeXObjectList expandonce(com.dickimawbooks.texparserlib.latex.TeXParser parser, com.dickimawbooks.texparserlib.latex.TeXObjectList stack) throws java.io.IOException {
    com.dickimawbooks.texparserlib.latex.TeXObject arg = stack.popArg(parser);
    com.dickimawbooks.texparserlib.latex.TeXObject arg = stack.popArg(parser);
    return new com.dickimawbooks.texparserlib.latex.TeXObjectList();
}