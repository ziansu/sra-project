@org.junit.AfterClass
public static void tearDownClass() throws java.lang.Exception {
    com.acmeair.CustomerServiceApplicationTest.mongoClient.close();
    if ((com.acmeair.CustomerServiceApplicationTest.mongodProcess) != null) {
        com.acmeair.CustomerServiceApplicationTest.mongodProcess.stop();
    }
    if ((com.acmeair.CustomerServiceApplicationTest.mongodExecutable) != null) {
        com.acmeair.CustomerServiceApplicationTest.mongodExecutable.stop();
    }
}