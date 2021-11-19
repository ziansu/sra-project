public void setLexicalValue(final TYPE value) {
    if (lexicalValueStack.isEmpty()) {
        lexicalValueStack.push(value);
    }else {
        lexicalValueStack.pop();
        lexicalValueStack.push(value);
    }
}