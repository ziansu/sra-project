@com.bf.benchmark.Benchmark
public void mandelbrot(org.openjdk.jmh.infra.Blackhole hole) {
    java.lang.Object call = callTarget.call();
    hole.consume(call);
}