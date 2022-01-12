@org.junit.Test
public void testSetup() {
    assertNotNull(Controller.conversation);
    assertNotNull(Controller.input);
    assertNotNull(Controller.analyzer);
    assertNotNull(Controller.mdp);
    assertNotNull(Controller.hyperVariables);
}