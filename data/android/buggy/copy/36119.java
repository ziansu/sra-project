@org.junit.Test
public void testDoubleDown() {
    models.Game g = new models.Game();
    models.User u = new models.User();
    u.hostGame = g;
    int result = u.doubleDown(20);
    assertEquals(40, result);
}