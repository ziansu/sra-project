@java.lang.Override
public void accept(expressiontree.utils.IRVisitor visitor) {
    condition.accept(visitor);
    thenPart.accept(visitor);
    elsePart.accept(visitor);
    visitor.visit(this);
}