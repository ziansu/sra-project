@org.springframework.web.bind.annotation.RequestMapping(value = "/login", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String getLoginPage(org.springframework.ui.Model model) {
    if ((org.springframework.security.core.context.SecurityContextHolder.getContext().getAuthentication()) instanceof org.springframework.security.authentication.AnonymousAuthenticationToken) {
        return "login";
    }
    return "redirect:/login?success=true";
}