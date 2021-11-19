@org.springframework.web.bind.annotation.RequestMapping(value = "/oauth/confirm_access")
public org.springframework.web.servlet.ModelAndView getAccessConfirmation(@org.springframework.web.bind.annotation.ModelAttribute
org.springframework.security.oauth2.provider.AuthorizationRequest clientAuth) {
    return new org.springframework.web.servlet.ModelAndView("access_confirmation").addObject("auth_request", clientAuth).addObject("client", clientDetailsService.loadClientByClientId(clientAuth.getClientId()));
}