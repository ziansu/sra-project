@java.lang.Override
public java.util.Vector minus(java.util.Vector vec) {
    checkCardinality(vec);
    java.util.Vector cp = copy();
    cp.map(vec, Functions.MINUS);
    return cp;
}