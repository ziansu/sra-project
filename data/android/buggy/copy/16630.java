@java.lang.Override
public boolean canConnectTo(net.minecraft.util.EnumFacing side) {
    return (side.equals(getOutputFace())) || (side.getOpposite().equals(getOutputFace()));
}