@org.springframework.web.bind.annotation.RequestMapping(value = "/lang", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String getUserLang(javax.servlet.http.HttpServletRequest request) {
    return ('"' + (localeService.getUserLocale(request).getLanguage())) + '"';
}