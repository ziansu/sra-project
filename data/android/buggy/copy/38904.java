@java.lang.Override
public void addEmc(double amount) {
    emc += amount;
    if (((emc) > (maxAmount)) || ((emc) < 0)) {
        emc = maxAmount;
    }
}