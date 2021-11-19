@org.openjdk.jmh.annotations.Benchmark
public int interfaceMethods() {
    return work1.doWorkInterface(java.util.Collections.emptyList());
}