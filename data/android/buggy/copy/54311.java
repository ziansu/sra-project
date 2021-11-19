@java.lang.Override
public boolean addRep(order_management.Rep rep) {
    if ((rep == null) || ((getRep(rep.getIdentifier())) != null)) {
        return false;
    }
    reps.add(rep);
    return true;
}