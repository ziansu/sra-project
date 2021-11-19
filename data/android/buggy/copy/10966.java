@org.springframework.web.bind.annotation.RequestMapping(value = "/register", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String register(@org.springframework.web.bind.annotation.ModelAttribute
com.dinner.model.security.DinnerUser registerUser) {
    try {
        dinnerUserService.registerNewUserAccount(registerUser);
    } catch (com.dinner.service.exception.EmailExistException e) {
        java.lang.System.out.println(e.getMessage());
    }
    return "redirect:/";
}