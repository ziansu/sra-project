@org.springframework.web.bind.annotation.GetMapping(value = { "/userRegister" , "/admin/userRegister" })
public java.lang.String getUserRegisterPage(org.springframework.ui.Model model) {
    com.fithub.controller.UserRegisterController.LOG.debug("Displaying User Registration page");
    com.fithub.domain.UserDTO userDTO = new com.fithub.domain.UserDTO();
    model.addAttribute("userDTO", userDTO);
    model.addAttribute("showRegister", 1);
    return "user/registration";
}