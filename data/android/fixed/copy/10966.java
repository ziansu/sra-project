@org.springframework.web.bind.annotation.RequestMapping(value = "/register", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String register(@org.springframework.web.bind.annotation.ModelAttribute
com.dinner.model.security.DinnerUser registerUser) throws com.dinner.service.exception.EmailExistException {
    dinnerUserService.registerNewUserAccount(registerUser);
    return "redirect:/";
}