protected java.lang.String getUser(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse res) {
    if (useNtlm)
        return null;
    else
        return getBasicUser(req, res);
    
}