@com.springapp.mvc.controller.RequestMapping(value = "showMissings", method = RequestMethod.GET)
public org.springframework.web.servlet.ModelAndView showMissings(@com.springapp.mvc.controller.ModelAttribute
java.lang.String str) {
    return new org.springframework.web.servlet.ModelAndView("missingForm", "message", userDAO.getMissings());
}