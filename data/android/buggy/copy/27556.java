@org.junit.Test
public void testIsUsernameAvailable_availableUsername() {
    org.mockito.Mockito.when(userDao.findByUsername("notExistingUser")).thenReturn(new todolist.domain.User());
    org.junit.Assert.assertTrue(userService.isUsernameAvailable("notExistingUser"));
}