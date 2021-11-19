@org.junit.Test(expected = java.lang.IllegalStateException.class)
public void login_failed_when_user_not_found() {
    when(userRepository.findByUserId("sanjigi")).thenReturn(java.util.Optional.empty());
    userService.login("sanjigi", "password");
}