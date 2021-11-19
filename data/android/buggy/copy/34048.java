@java.lang.Override
public boolean fight(java.lang.String oponent) {
    if (this.getClass().toString().equals(oponent)) {
        return true;
    }
    return false;
}