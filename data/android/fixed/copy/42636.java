@org.springframework.web.bind.annotation.PostMapping(value = "/signup")
public java.lang.String signupSubmit(@org.springframework.web.bind.annotation.ModelAttribute
securbank.models.User user, org.springframework.validation.BindingResult bindingResult) {
    userFormValidator.validate(user, bindingResult);
    if (bindingResult.hasErrors()) {
        java.lang.System.out.println(bindingResult);
        return "signup";
    }
    userService.createExternalUser(user);
    return "redirect:/";
}