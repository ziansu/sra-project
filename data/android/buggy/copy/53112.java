@java.lang.Override
public boolean canDrawGas(net.minecraft.util.EnumFacing side, mekanism.api.gas.Gas type) {
    return type == (mekanism.api.gas.GasRegistry.getGas("steam"));
}