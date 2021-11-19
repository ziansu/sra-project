public boolean registrieren(java.lang.String name, java.lang.String passwort) {
    name.toLowerCase();
    return dao.push(((name + ";") + passwort));
}