@org.junit.After
public void afterEach() throws java.lang.Exception {
    testRepository.setCnd("cnd/cars.cnd");
    try {
        testRepository.setDropOnExit(true);
        testRepository.restart();
        testRepository.shutdown();
    } catch (java.lang.Exception e) {
    }
}