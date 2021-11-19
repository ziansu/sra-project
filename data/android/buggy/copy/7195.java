@org.junit.Test
public void testAccountKeyRetrieve() throws com.kloudless.exception.KloudlessException {
    com.kloudless.model.Key key = com.kloudless.model.Key.retrieve("12666", "1", null);
    java.lang.System.out.println(key);
}