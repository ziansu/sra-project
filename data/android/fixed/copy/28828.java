@org.springframework.web.bind.annotation.RequestMapping(value = "/logout", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public void logOut(javax.servlet.http.HttpServletRequest request) {
    if ((request.getSession().getAttribute("user")) != null) {
        request.getSession().removeAttribute("user");
    }
    request.getSession().invalidate();
}