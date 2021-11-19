@org.springframework.web.bind.annotation.RequestMapping(value = "/selectByPage")
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String selectByPage(com.gsy.ssm.model.User user) {
    java.util.List<com.gsy.ssm.model.User> users = userService.selectByPage(user);
    java.lang.String result = com.gsy.ssm.utils.JacksonUtils.writeValueAsString(users);
    return result;
}