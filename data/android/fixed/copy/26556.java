@java.lang.Override
public int fill(net.minecraftforge.fluids.FluidStack resource, boolean doFill) {
    int amount = super.fill(resource, doFill);
    if (doFill) {
        locked += amount;
    }
    return amount;
}