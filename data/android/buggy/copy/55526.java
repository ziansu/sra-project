@org.junit.Test
public void testLogOn() {
    cmcControllerTests.PersonUI ui = controller.logOn("ImadUser", "Edited", true);
    assertTrue("is admin", (ui instanceof cmcControllerTests.AdminUI));
}