@org.junit.Test
public void MybatisTest() throws java.lang.Exception {
    junstech.model.User user = userService.getUser(588884563);
    java.lang.System.out.println(user.getNickname());
}