@org.springframework.web.bind.annotation.ResponseBody
@org.springframework.web.bind.annotation.RequestMapping(value = "/users")
public java.lang.String getUsers() {
    java.util.List<com.michealyang.model.TestUser> userList = testService.getUsers();
    if (userList == null) {
        return "Empty";
    }
    return userList.toString();
}