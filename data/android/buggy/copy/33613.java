@org.springframework.web.bind.annotation.RequestMapping(value = "users/add")
public java.lang.String formNewUser(org.springframework.ui.Model model) {
    if (!(model.containsAttribute("user"))) {
        model.addAttribute("user", new com.teamtreehouse.domain.User());
    }
    model.addAttribute("action", "users/add");
    return "signup";
}