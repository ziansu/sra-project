@java.lang.Override
public boolean isDelivery() {
    if (((delTime) > 0) && ((delTime) < 60))
        return true;
    
    return false;
}