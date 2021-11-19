@org.junit.Test
public void testFindAll() {
    final java.util.List<com.musicforall.model.User> users = userService.findAll();
    assertSame(users.size(), 4);
}