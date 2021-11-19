@org.junit.BeforeClass
public static void loadEnv() {
    reactor.Environment.initializeIfEmpty().assignErrorJournal();
}