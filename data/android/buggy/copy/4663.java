@org.springframework.web.bind.annotation.RequestMapping(value = "/register")
public java.lang.String register() {
    java.util.List<cn.com.tsjx.user.entity.User> user = userService.getUsersByEmail("333");
    java.lang.System.out.println(user);
    return "/wap/register-success";
}