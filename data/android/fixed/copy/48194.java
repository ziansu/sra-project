@java.lang.Override
@org.springframework.web.bind.annotation.RequestMapping(value = "/")
public org.springframework.web.servlet.ModelAndView getAll(javax.servlet.http.HttpServletRequest request) {
    request.setAttribute("list", serviceAction.getAll());
    return new org.springframework.web.servlet.ModelAndView("/action/listActions");
}