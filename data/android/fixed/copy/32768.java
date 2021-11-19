@org.springframework.web.bind.annotation.RequestMapping(value = "/login", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.web.servlet.ModelAndView getLogin() {
    return new org.springframework.web.servlet.ModelAndView("login");
}