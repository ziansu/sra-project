@org.springframework.web.bind.annotation.GetMapping(value = "/register")
public java.lang.String getRegisterPage(org.springframework.ui.Model model, by.epam.jmp.app.tradesystem.web.dto.RegisterFormDTO registerFormDTO) {
    model.addAttribute("registerForm", (registerFormDTO != null ? registerFormDTO : new by.epam.jmp.app.tradesystem.web.dto.RegisterFormDTO()));
    return "register";
}