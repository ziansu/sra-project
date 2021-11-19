@org.junit.Test
public void testRunAsyncSupplyExecutor() {
    kr.jm.utils.helper.JMThread.supplyAsync(() -> 1 / 0);
}