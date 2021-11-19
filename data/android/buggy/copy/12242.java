@java.lang.Override
public void postHandle(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse httpServletResponse) throws java.lang.Exception {
    final java.lang.String[] redirUrl = request.getParameterValues("redir");
    httpServletResponse.sendRedirect(redirUrl[0]);
}