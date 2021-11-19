@org.springframework.web.bind.annotation.RequestMapping(value = "login")
public java.lang.String getLogin() {
    java.lang.System.out.println("login action ...");
    if (org.apache.shiro.SecurityUtils.getSubject().isAuthenticated()) {
        return "index";
    }else {
        return "login";
    }
}