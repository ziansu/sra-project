@org.junit.Before
public void setup() {
    org.springframework.cloud.sleuth.trace.TestSpanContextHolder.removeCurrentSpan();
}