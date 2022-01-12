public void write(pl.edu.mimuw.nesc.astwriting.Node node) {
    node.accept(writeVisitor, null);
}