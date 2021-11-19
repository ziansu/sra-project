public void setLexicalValue(final TYPE value) {
    if (!(lexicalValueStack.isEmpty())) {
        lexicalValueStack.pop();
        lexicalValueStack.push(value);
    }
}