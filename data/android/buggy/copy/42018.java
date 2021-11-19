@org.junit.Test
public void getIDTest() {
    java.lang.String param;
    param = "";
    task.setID(param);
    assertEquals(task.getID(), param);
}