@org.openjdk.jmh.annotations.Benchmark
public int staticFunctions() {
    return com.github.dcapwell.java.methodtypes.FunctionTypes.RealWork.doWorkStatic(java.util.Collections.emptyList());
}