public boolean addValue(org.eclipse.golo.compiler.ir.UnionValue value) {
    makeParentOf(value);
    return values.add(value);
}