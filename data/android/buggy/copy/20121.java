@org.springframework.web.bind.annotation.RequestMapping(value = "/login")
public java.lang.String login(org.springframework.ui.Model model) {
    asw.persistence.FillDatabase fd = new asw.persistence.FillDatabase();
    fd.fill();
    model.addAttribute("loginUser", new asw.model.impl.User());
    return "login";
}