@org.springframework.web.bind.annotation.RequestMapping(value = "/registerForm", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String registerForm(org.springframework.ui.Model model) {
    at.fh.swenga.model.User user = new at.fh.swenga.model.User();
    model.addAttribute("user", user);
    return "register";
}