public java.lang.String signUp() {
    user.setDateInscription(new java.util.Date());
    service.add(user);
    logIn();
    return "profile";
}