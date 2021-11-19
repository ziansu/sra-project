@java.lang.Override
public java.lang.String getPrincipal() {
    return (httpServletRequest.getUserPrincipal()) != null ? httpServletRequest.getUserPrincipal().getName() : null;
}