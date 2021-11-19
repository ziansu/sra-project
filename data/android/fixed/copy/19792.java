@org.junit.Before
public void setup() {
    provider.setLoggers(readLogger, writeLogger);
}