@org.springframework.web.bind.annotation.RequestMapping(value = "/UserProfile/{login}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.web.servlet.ModelAndView userProfile(org.springframework.ui.Model model, @org.springframework.web.bind.annotation.PathVariable
java.lang.String login) {
    configureCloudinary(model);
    model.addAttribute("profile", userService.findByLogin(login));
    return new org.springframework.web.servlet.ModelAndView("userProfile");
}