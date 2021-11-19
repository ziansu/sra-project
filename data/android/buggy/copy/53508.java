@org.springframework.web.bind.annotation.RequestMapping(value = "/index")
public org.springframework.web.servlet.ModelAndView index() {
    org.springframework.web.servlet.ModelAndView result = new org.springframework.web.servlet.ModelAndView("index");
    return result;
}