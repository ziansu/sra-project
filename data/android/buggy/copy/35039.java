@org.junit.After
public void checkThreadDump() {
    threadDump.ignore("all-trees-watcher");
    threadDump.assertNoNewThreads();
}