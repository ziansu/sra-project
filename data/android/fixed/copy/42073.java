public wyil.util.AttributedCodeBlock createSubBlock() {
    wyil.lang.CodeBlock.Index index = new wyil.lang.CodeBlock.Index(ID, size());
    return new wyil.util.AttributedCodeBlock(index, this);
}