@java.lang.Override
public org.la4j.vector.Vector createVector(org.la4j.vector.source.VectorSource source) {
    return org.la4j.vector.dense.BasicVector.fromSource(source);
}