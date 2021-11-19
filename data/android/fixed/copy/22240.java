@org.junit.Test
public void connectionTest() throws java.lang.Exception {
    assert (new infoeval.main.WikiData.Connector().getConnection()) != null;
}