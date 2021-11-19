public boolean hasMain(bantam.visitor.Program ast) {
    this.hasClass = false;
    this.hasMethod = false;
    ast.accept(this);
    return (this.hasClass) && (this.hasMethod);
}