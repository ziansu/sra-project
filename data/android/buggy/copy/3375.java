@org.junit.Test
public void contextLoads() {
    com.takeaway.model.user.User user = userRepo.findByUserNameAndPassword("user", "123456");
    java.util.List<com.takeaway.model.user.Address> addresses = user.getAddressList();
}