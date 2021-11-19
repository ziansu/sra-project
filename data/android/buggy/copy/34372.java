@java.lang.Override
public void doFilter(javax.servlet.ServletRequest arg0, javax.servlet.ServletResponse arg1, javax.servlet.FilterChain arg2) throws java.io.IOException, javax.servlet.ServletException {
    try {
        arg2.doFilter(arg0, arg1);
    } catch (javax.servlet.ServletException e) {
        java.lang.System.err.println("this is error lol");
    }
}