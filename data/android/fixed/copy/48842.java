@org.springframework.web.bind.annotation.RequestMapping(value = "/admin/employees", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.util.List<com.revature.aes.beans.User> getEmployees() {
    java.util.List<com.revature.aes.beans.User> users = userService.findUsersByRole("recruiter");
    users.addAll(userService.findUsersByRole("trainer"));
    return users;
}