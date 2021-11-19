@org.junit.Test
public void testCheckLogin() {
    application.controllers.PublicMenuController controller = new application.controllers.PublicMenuController();
    mock(controller);
    controller.setUsername(username);
    controller.setPassword(password);
    org.junit.Assert.assertEquals(expected, controller.checkLogin());
}