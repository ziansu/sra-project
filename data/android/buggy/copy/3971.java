@org.springframework.web.bind.annotation.RequestMapping(value = "/payfailed", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public org.springframework.web.servlet.ModelAndView payFailedPost() {
    return new org.springframework.web.servlet.ModelAndView("redirect:/");
}