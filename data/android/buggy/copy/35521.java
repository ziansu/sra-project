public void addValue(org.eclipse.golo.compiler.ir.UnionValue value) {
    values.add(value);
    makeParentOf(value);
}