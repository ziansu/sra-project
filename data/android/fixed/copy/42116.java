private void addOrUpdatePersonDB(com.tsystems.JavaSchool.ShopOnline.Controller.Person person) {
    try {
        new com.tsystems.JavaSchool.ShopOnline.Controller.SignupDAO().addOrUpdateUser(person);
    } catch (java.lang.Exception ex) {
        forward = "./pages/error.jsp";
    }
}