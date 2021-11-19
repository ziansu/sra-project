@org.junit.After
public void tearDown() throws java.lang.Exception {
    net.polybugger.apollot.db.ApolloDbAdapter.close();
}