public void visit(Variable e) {
    e.getName().accept(this);
    e.getValue().accept(this);
}