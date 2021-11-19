@java.lang.Override
public double getMaxOutput() {
    if (!(((hasStartedCrafting) && ((currentRecipe) != null)) && ((currentRecipe.getEuTick()) > 0))) {
        return 0;
    }
    return 1000000;
}