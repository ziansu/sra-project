@org.springframework.web.bind.annotation.ExceptionHandler
public org.springframework.web.servlet.ModelAndView handleException(java.lang.Exception ex) {
    org.springframework.web.servlet.ModelAndView mav = new org.springframework.web.servlet.ModelAndView("error", "msg", ex.getMessage());
    return mav;
}