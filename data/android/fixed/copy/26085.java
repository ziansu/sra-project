@org.springframework.web.bind.annotation.RequestMapping(value = "/")
public java.lang.String homePage(org.springframework.ui.Model model) {
    model.addAttribute("login", new ro.ebs.studenttime.api.LoginAPI());
    return "login";
}