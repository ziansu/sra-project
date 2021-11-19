@org.junit.Test
public void getCommand() throws java.lang.Exception {
    jfdi.logic.events.AliasDoneEvent e = new jfdi.logic.events.AliasDoneEvent(jfdi.test.logic.events.AliasDoneEventTest.COMMAND, jfdi.test.logic.events.AliasDoneEventTest.ALIAS);
    assertEquals(jfdi.test.logic.events.AliasDoneEventTest.COMMAND, e.getCommand());
}