@java.lang.Override
public void close() throws java.lang.Exception {
    timer.cancel();
    executor.shutdown();
    searchEngine.quit();
    controllerEngine.quit();
}