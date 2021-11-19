@java.lang.Override
public java.lang.String getPrincipal() {
    return (httpServletRequest) == null ? null : (httpServletRequest.getUserPrincipal()) != null ? httpServletRequest.getUserPrincipal().getName() : null;
}