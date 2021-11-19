public boolean Term() {
    if (!((Var()) || (Int()))) {
        java.lang.System.out.println(("You are missing term " + (Int())));
        return false;
    }
    return true;
}