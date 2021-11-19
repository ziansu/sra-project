@org.junit.Test
public void findGroupsByIdTest() {
    java.lang.String[] urls = UserService.findGroupsById(4, 16);
    for (java.lang.String string : urls) {
        java.lang.System.out.println(string);
    }
}