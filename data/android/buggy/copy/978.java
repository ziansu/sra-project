@org.junit.Before
public void setUp() throws java.lang.Exception {
    com.goeuro.challenges.data.DataReader dataReader = new com.goeuro.challenges.data.DataReader("data/example");
    routesAtStation = dataReader.read();
}