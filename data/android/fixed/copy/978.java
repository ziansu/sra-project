@org.junit.Before
public void setUp() throws java.lang.Exception {
    dataReader = new com.goeuro.challenges.data.DataReader("data/example");
    routesAtStation = dataReader.read();
}