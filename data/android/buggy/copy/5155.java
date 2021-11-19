@java.lang.Override
protected net.minecraft.block.state.BlockState createBlockState() {
    net.minecraft.block.properties.PropertyDirection test = BlockGraveStone.FACING;
    return new net.minecraft.block.state.BlockState(this, com.fireball1725.graves.block.BlockGraveSlave.slaveType, com.fireball1725.graves.block.BlockGraveSlave.isFoot, BlockGraveStone.FACING);
}