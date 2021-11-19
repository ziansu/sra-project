@org.springframework.web.bind.annotation.RequestMapping(value = "/login")
public java.lang.String login(org.springframework.ui.Model model) {
    model.addAttribute("loginUser", new asw.model.impl.User());
    return "login";
}