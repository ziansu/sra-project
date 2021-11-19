@org.junit.Before
public void setup() throws java.lang.Exception {
    connection.start();
    underTest = new org.apache.activemq.TransactionContext(connection);
}