public boolean dispatch(int a) {
    if ((amount) > a) {
        dispatched += a;
        amount -= a;
        return true;
    }
    return false;
}