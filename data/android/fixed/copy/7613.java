public boolean Term() {
    if (!((Var()) || (Int()))) {
        return false;
    }
    return true;
}