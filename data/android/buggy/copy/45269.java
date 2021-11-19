public boolean anmelden(java.lang.String name, java.lang.String passwort) {
    if (dao.isIn(((name + ";") + passwort))) {
        return true;
    }
    return false;
}