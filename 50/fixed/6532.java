@org.springframework.web.bind.annotation.RequestMapping(value = "/login", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String login(com.hlz.webModel.UserModel user) {
    if ((service.login(user)) != null) {
        return "redirect:/";
    }else {
        return "login";
    }
}