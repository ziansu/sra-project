@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.POST, consumes = { "text/html" , "application/x-www-form-urlencoded" , "application/json" })
@org.springframework.web.bind.annotation.ResponseBody
public java.util.List<com.medico.swiftcure.model.Doctor> navigatorSearchAjax(@org.springframework.web.bind.annotation.RequestBody
com.medico.swiftcure.model.NavigatorSearch search, org.springframework.ui.Model model, javax.servlet.http.HttpSession session) {
    session.setAttribute("navigatorSearch", search);
    int from = 1;
    java.util.List<com.medico.swiftcure.model.Doctor> list = searchService.navigatorSearchPaginated(search, from);
    return list;
}