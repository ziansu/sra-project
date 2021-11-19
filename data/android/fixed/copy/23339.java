public static org.json.simple.JSONObject logOutUser(javax.servlet.http.HttpSession session) {
    session.invalidate();
    java.lang.System.out.println(("session logout>>>" + session));
    return null;
}