@org.openjdk.jmh.annotations.Benchmark
public void testBytesContended(io.github.pr0methean.betterrandom.benchmark.AbstractRandomBenchmark.PrngState state) throws io.github.pr0methean.betterrandom.seed.SeedException, java.lang.InterruptedException {
    innerTestBytesContended(state.prng);
}