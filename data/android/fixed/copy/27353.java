@org.springframework.web.bind.annotation.GetMapping(value = "/register")
public java.lang.String getRegisterPage(org.springframework.ui.Model model) {
    model.addAttribute("registerForm", new by.epam.jmp.app.tradesystem.web.dto.RegisterFormDTO());
    return "register";
}