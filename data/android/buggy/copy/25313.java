@org.junit.Test
public void testAddUser() {
    userRepository.addUser("sadvit", "sadvit", Role.ADMIN);
    userRepository.addUser("mrsadvit", "sadvit", Role.USER);
}