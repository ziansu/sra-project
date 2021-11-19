@org.springframework.web.bind.annotation.RequestMapping(value = "/admin/employees", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.util.List<com.revature.aes.beans.User> getEmployees() {
    java.util.List<com.revature.aes.beans.User> users = new java.util.ArrayList<com.revature.aes.beans.User>();
    users = userService.findAllUsers();
    return users;
}