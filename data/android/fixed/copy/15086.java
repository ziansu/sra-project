@org.junit.Test
public void selectByNicknameTest() {
    assertEquals("NICKNAME1", userDAO.selectByNickname("NICKNAME1").getNickname());
}