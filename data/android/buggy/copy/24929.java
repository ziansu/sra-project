public boolean canGrow(com.couchdoescode.tea.crops.World worldIn, com.couchdoescode.tea.crops.BlockPos pos, com.couchdoescode.tea.crops.IBlockState state, boolean isClient) {
    return (((java.lang.Integer) (state.getValue(com.couchdoescode.tea.crops.BlockGreenTea.AGE))).intValue()) != 7;
}