@org.junit.Before
public void setUp() throws java.lang.Exception {
    dDosProducer = new producer.DDosProducer("0.0.0.0:9092", "topic", 0, 1, java.util.concurrent.TimeUnit.MICROSECONDS);
    normalProducer = new producer.NormalProducer("0.0.0.0:9092", "topic", 0, 1, java.util.concurrent.TimeUnit.MICROSECONDS);
}