@org.springframework.web.bind.annotation.RequestMapping(value = "/register-step-2", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public org.springframework.web.servlet.ModelAndView processRegisterStepTwo(@org.springframework.web.bind.annotation.ModelAttribute(value = "user")
com.cookbook.domain.User user) {
    userService.save(user);
    org.springframework.web.servlet.ModelAndView mav = new org.springframework.web.servlet.ModelAndView();
    mav.setViewName("user/home");
    return mav;
}