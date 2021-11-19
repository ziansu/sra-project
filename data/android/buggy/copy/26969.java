protected java.lang.String getUser(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse res) {
    if (useNtlm)
        return ntlm.getUser(req, res);
    else
        return getBasicUser(req, res);
    
}