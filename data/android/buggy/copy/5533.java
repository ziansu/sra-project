boolean closeEnough() {
    return (java.lang.Math.abs(((exp) - (obtained)))) < (org.apache.ignite.math.impls.DenseLocalOnHeapVectorTest.Metric.tolerance);
}