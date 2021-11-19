@org.testng.annotations.Test
public void getUser() {
    java.lang.String userInfo = userClient.getUser();
    java.lang.System.out.println(userInfo);
}