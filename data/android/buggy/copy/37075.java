@java.lang.Override
public boolean canBeRidden() {
    if (((isLocomotive()) || (isPassenger())) || (isWorkCart())) {
        return true;
    }
    return false;
}