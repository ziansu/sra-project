@org.apache.shiro.authz.annotation.RequiresRoles(value = { "管理员" })
@org.springframework.web.bind.annotation.RequestMapping(value = "/rules")
public java.lang.String rules(javax.servlet.http.HttpServletRequest request, org.springframework.ui.Model model) throws org.apache.shiro.authz.AuthorizationException {
    return "frontend/rule";
}