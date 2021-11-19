@org.junit.Test
public void testWritePosWrapped() {
    Home.Egor.RingBuffer ringBuffer = new Home.Egor.RingBuffer(2);
    ringBuffer.put(1);
    ringBuffer.put(2);
    org.junit.Assert.assertEquals(ringBuffer.writePos(), 0);
}