@org.springframework.web.bind.annotation.RequestMapping(value = "/login")
public java.lang.String login(org.springframework.ui.Model model) {
    model.addAttribute("button", "Sign in with Slack");
    model.addAttribute("msg", message);
    message = "";
    return "login";
}