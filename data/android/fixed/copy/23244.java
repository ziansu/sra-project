@org.springframework.web.bind.annotation.RequestMapping(value = "/Dashboard", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.web.servlet.ModelAndView dashboard() {
    org.springframework.web.servlet.ModelAndView model = new org.springframework.web.servlet.ModelAndView("Dashboard");
    return model;
}