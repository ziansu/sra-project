public net.minecraft.util.EnumFacing getRotate() {
    switch (rotate) {
        case 0 :
            return net.minecraft.util.EnumFacing.EAST;
        case 1 :
            return net.minecraft.util.EnumFacing.NORTH;
        case 2 :
            return net.minecraft.util.EnumFacing.WEST;
        default :
            return net.minecraft.util.EnumFacing.SOUTH;
    }
}