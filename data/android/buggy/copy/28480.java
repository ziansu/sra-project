@org.springframework.web.bind.annotation.RequestMapping(value = "/user")
@org.springframework.web.bind.annotation.ResponseBody
public java.util.Map<java.lang.String, java.lang.String> json() {
    java.util.Map<java.lang.String, java.lang.String> result = userService.getUserInfo();
    return result;
}