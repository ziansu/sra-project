private void addOrUpdatePersonDB(javax.servlet.http.HttpServletRequest req) {
    try {
        com.tsystems.JavaSchool.ShopOnline.Controller.Person person = makePerson(req);
        new com.tsystems.JavaSchool.ShopOnline.Controller.SignupDAO().addOrUpdateUser(person);
    } catch (java.lang.Exception ex) {
        forward = "./pages/error.jsp";
    }
}