@org.springframework.web.bind.annotation.RequestMapping(value = "/deleteAsset", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.web.servlet.ModelAndView deleteAsset(javax.servlet.http.HttpServletRequest request) {
    java.lang.Long id = ((long) (java.lang.Integer.parseInt(request.getParameter("id"))));
    userService.deleteAsset(id);
    return new org.springframework.web.servlet.ModelAndView("redirect:/assetslist");
}