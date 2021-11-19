@org.springframework.web.bind.annotation.RequestMapping(value = "/redirect", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public com.witvan.wechat.domain.RedirectResponse getRedirectUri(@org.springframework.web.bind.annotation.RequestParam
java.lang.String url, @org.springframework.web.bind.annotation.RequestParam
java.lang.String event, javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) {
    com.witvan.wechat.controller.BaseController.logger.info("getting redirect in base controller");
    com.witvan.wechat.domain.RedirectResponse redirectUrl = userService.checkRedirect(request, event, url, false);
    return redirectUrl;
}