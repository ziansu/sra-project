@org.junit.After
public void checkThreadDump() {
    if ((threadDump) != null) {
        threadDump.ignore("all-trees-watcher");
        threadDump.assertNoNewThreads();
    }
}