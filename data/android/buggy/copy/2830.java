@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void testLogOnBadPassword() {
    cmcControllerTests.PersonUI ui = controller.logOn("ImadUser", "wrong", true);
}