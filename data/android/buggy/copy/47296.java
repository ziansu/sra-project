@org.springframework.web.bind.annotation.RequestMapping(value = "/logout", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String logout(javax.servlet.http.HttpServletRequest request, org.springframework.ui.Model model) {
    com.flyer.guru.controller.LoginController.LOG.info("User {} logout the system", request.getSession().getAttribute("user"));
    org.apache.shiro.SecurityUtils.getSubject().logout();
    return "login";
}