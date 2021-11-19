@org.junit.Test
public void test2() {
    com.sohu.model.User user = template.get(com.sohu.model.User.class, 1L);
    java.lang.System.out.println(user.toString());
}