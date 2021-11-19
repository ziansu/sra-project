public void testSubUsername() {
    sub.setUsername("myusername");
    assertTrue(user.getUsername().equals("myusername"));
}