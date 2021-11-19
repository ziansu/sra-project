public org.json.simple.JSONObject logOutUser() {
    javax.servlet.http.HttpSession session = getSession();
    session.invalidate();
    java.lang.System.out.println(("session logout>>>" + session));
    java.lang.System.out.println(("---session login user>>>" + (session.getAttribute("user"))));
    return null;
}