@org.junit.Before
public void setup() {
    com.netflix.hystrix.strategy.HystrixPlugins.reset();
    org.springframework.cloud.sleuth.trace.TestSpanContextHolder.removeCurrentSpan();
}