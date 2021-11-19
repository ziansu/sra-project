@org.springframework.web.bind.annotation.RequestMapping(value = "/me", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String userInfo(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, java.net.URISyntaxException {
    if (!(com.arr.rsoi.service.RestHelper.checkLogin(request, response))) {
        return null;
    }
    return applicationService.isLogin();
}