@java.lang.Override
public void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    if (isHdwServlet)
        checkHardwarePremission(response);
    else
        checkPermission(request, response);
    
}