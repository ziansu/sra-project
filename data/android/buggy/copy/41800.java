@org.junit.AfterClass
public static void tearDownClass() throws java.lang.Exception {
    com.acmeair.CustomerServiceApplicationTest.mongoClient.close();
    com.acmeair.CustomerServiceApplicationTest.mongodProcess.stop();
    com.acmeair.CustomerServiceApplicationTest.mongodExecutable.stop();
}